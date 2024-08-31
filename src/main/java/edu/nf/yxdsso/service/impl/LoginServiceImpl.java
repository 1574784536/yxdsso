package edu.nf.yxdsso.service.impl;

import edu.nf.yxdsso.exception.AccessException;
import edu.nf.yxdsso.service.LoginService;
import edu.nf.yxdsso.utils.JwtUtil;
import edu.nf.yxdsso.vo.AuthRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author YXD
 * @date 2024/8/31
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserInfoDetailService userInfoDetailService;

    @Override
    public String doLogin(AuthRequest authRequest) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        } catch (AuthenticationException e) {
            throw new AccessException(e.getMessage());
        }
        UserDetails userDetails = userInfoDetailService.loadUserByUsername(authRequest.getUsername());
        String jwt = JwtUtil.generateToken(userDetails);

        return jwt;
    }
}
