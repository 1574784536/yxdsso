package edu.nf.yxdsso.security;

import edu.nf.yxdsso.service.impl.UserInfoDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author YXD
 * @date 2024/8/31
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    /**
     * 自定义的 UserDetailsService
     */
    @Autowired
    private UserInfoDetailService userInfoDetailService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String encode = passwordEncoder.encode("123456");
//        System.out.println("password encode:" + encode);
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        UserDetails user = userInfoDetailService.loadUserByUsername(username);

        if (user == null || !password.equals(user.getPassword())) {
            throw new BadCredentialsException("认证失败，用户名或密码错误");
        }
        return new UsernamePasswordAuthenticationToken(user, password, user.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
