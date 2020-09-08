package sample.service.impl;

import com.alsa.account.dto.User;
import com.alsa.account.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sample.custom.CustomUserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/9/7
 * @Time: 15:16
 * @Description:
 */
public class CustomUserDetailsService implements UserDetailsService {

    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.selectByUserName(username);
        Collection<SimpleGrantedAuthority> dbAuthSet = new ArrayList<SimpleGrantedAuthority>();
        dbAuthSet.add(new SimpleGrantedAuthority("ROLE_USER"));
        for(String role:user.getRoleCode()){
            dbAuthSet.add(new SimpleGrantedAuthority(role));
        }
        CustomUserDetails customUserDetails = new CustomUserDetails(user.getUserName(),user.getPasswordEncrypted(),dbAuthSet);
        return customUserDetails;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
