package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/4
 * @Time: 15:32
 * @Description:
 */
@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
        System.out.println();
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
