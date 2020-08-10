package com.alsa.alsa;

import com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.constructorBinding.AcmeProperties2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

@RestController
@SpringBootApplication
// @EnableConfigurationProperties(AcmeProperties2.class)
@ConfigurationPropertiesScan("com.alsa.alsa.springbootFeatures")
public class SpringbootLmApplication {

	// @RequestMapping("/")
	// String home() {
	// 	return "Hello World!";
	// }

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootLmApplication.class);
		//applicationContext类型，不是web的那种
		// app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
		// SpringApplication.run(SpringbootLmApplication.class, args);
	}

}
