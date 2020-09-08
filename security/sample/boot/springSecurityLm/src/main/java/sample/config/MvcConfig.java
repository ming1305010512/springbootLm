package sample.config;

import com.alsa.account.mapper.UserMapper;
import com.alsa.account.service.IUserService;
import com.alsa.account.service.impl.UserServiceImpl;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 14:38
 * @Description:
 */
@Configuration
public class MvcConfig {



//    @Bean
//    public DataSource dataSource(){
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://39.101.142.80:3306/hap_dev?serverTimezone=UTC");
//        dataSource.setUsername("hap_dev");
//        dataSource.setPassword("hap_dev");
//        return dataSource;
//    }
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
//    public IUserService userService(){
//        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        userServiceImpl.setUserMapper(userMapper);
//        return userServiceImpl;
//    }
}
