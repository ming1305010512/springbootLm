package org.springframework.security.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/4
 * @Time: 15:30
 * @Description:
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests((authorize)->authorize
                .antMatchers("/css/**","/index").permitAll()
                .antMatchers("/user/**").hasRole("USER")
        ).formLogin((formLogin) -> formLogin
                .loginPage("/login")
                .failureUrl("/login-error")
        );
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }
}
