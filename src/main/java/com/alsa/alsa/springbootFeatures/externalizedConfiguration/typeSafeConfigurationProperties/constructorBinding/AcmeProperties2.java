package com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.constructorBinding;

import com.alsa.alsa.springbootFeatures.externalizedConfiguration.typeSafeConfigurationProperties.javaBeanPropertiesBind.AcmeProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Created with IDEA
 * @author:longming
 * @Date:2020/7/25
 * @Time:16:05
 */
@ConstructorBinding
@ConfigurationProperties("acme2")
public class AcmeProperties2 {

    private boolean enabled ;
    private InetAddress remoteAddress;
    private Security security ;

    public AcmeProperties2(boolean enabled, InetAddress remoteAddress,@DefaultValue Security security) {
        this.enabled = enabled;
        this.remoteAddress = remoteAddress;
        this.security = security;
    }


    public boolean isEnabled() {
        return enabled;
    }


    public InetAddress getRemoteAddress() {
        return remoteAddress;
    }


    public Security getSecurity() {
        return security;
    }

    public static class Security{
        private String username;
        private String password;

        private List<String> roles ;

        public Security(String username, String password, @DefaultValue("user") List<String> roles) {
            this.username = username;
            this.password = password;
            this.roles = roles;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public List<String> getRoles() {
            return roles;
        }

        public void setRoles(List<String> roles) {
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "Security{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", roles=" + roles +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AcmeProperties{" +
                "enabled=" + enabled +
                ", remoteAddress=" + remoteAddress +
                ", security=" + security +
                '}';
    }
}
