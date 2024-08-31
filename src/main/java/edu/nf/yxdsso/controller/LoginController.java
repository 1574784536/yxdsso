package edu.nf.yxdsso.controller;

import edu.nf.yxdsso.service.LoginService;
import edu.nf.yxdsso.vo.AuthRequest;
import edu.nf.yxdsso.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YXD
 * @date 2024/8/31
 */
@RestController
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/authenticate")
    public ResultVO authenticate(@RequestBody AuthRequest authRequest) {
        return success(loginService.doLogin(authRequest));
    }
}
