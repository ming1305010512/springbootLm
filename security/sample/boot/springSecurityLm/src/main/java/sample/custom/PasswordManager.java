package sample.custom;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 19:58
 * @Description:
 */
public class PasswordManager implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
