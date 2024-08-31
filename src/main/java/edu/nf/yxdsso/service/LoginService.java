package edu.nf.yxdsso.service;

import edu.nf.yxdsso.vo.AuthRequest;

/**
 * @author YXD
 * @date 2024/8/31
 */
public interface LoginService {
    String doLogin(AuthRequest authRequest);
}
