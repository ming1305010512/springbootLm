package sample.config;

import com.alsa.account.mapper.UserMapper;
import com.alsa.account.service.IUserService;
import com.alsa.account.service.impl.UserServiceImpl;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.*;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import sample.service.impl.CustomUserDetailsService;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/4
 * @Time: 15:30
 * @Description:
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserMapper userMapper;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .mvcMatchers("/login","/sys/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().and()
                .httpBasic()
                .and()
                .sessionManagement()
                .maximumSessions(1)
//                .maxSessionsPreventsLogin(true) //设置为true，如果第一次登陆成功，第二次将会阻止登陆
                .expiredUrl("/sys/session/inValid");
    }

//    @Bean
//    public DataSource myDataSource(){
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
//        dataSource.setUrl("jdbc:h2:mem:bootapp;DB_CLOSE_DELAY=-1;mv_store=false");
//        dataSource.setUsername("sa");
//        dataSource.setPassword("");
//        return dataSource;
//    }

//    @Bean
//    public DataSource dataSource(){
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://39.101.142.80:3306/hap_dev?serverTimezone=UTC");
//        dataSource.setUsername("hap_dev");
//        dataSource.setPassword("hap_dev");
//        return dataSource;
//    }

    /**
     *密码编码器
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        PasswordEncoder passwordEncoder =
                new StandardPasswordEncoder("my-secret-key");
        return passwordEncoder;
    }

    @Bean
    public IUserService userService(){
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserMapper(userMapper);
        userServiceImpl.setPasswordEncoder(passwordEncoder());
        return userServiceImpl;
    }

    @Bean
    public UserDetailsService userDetailsService(){
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("password")
//                .roles("USER","ADMIN")
//                .build();
        CustomUserDetailsService userDetailsManager = new CustomUserDetailsService();
        userDetailsManager.setUserService(userService());
//        return new InMemoryUserDetailsManager(user,admin);
        return userDetailsManager;
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService());
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }

}
