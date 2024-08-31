package edu.nf.yxdsso.controller;

import edu.nf.yxdsso.entity.UserInfo;
import edu.nf.yxdsso.service.UserInfoService;
import edu.nf.yxdsso.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YXD
 * @date 2024/8/31
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/userInfoList")
    public ResultVO<List<UserInfo>> userInfoList() {
        return success(userInfoService.list());
    }
}
