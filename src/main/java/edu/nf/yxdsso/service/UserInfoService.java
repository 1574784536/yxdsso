package edu.nf.yxdsso.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.nf.yxdsso.entity.UserInfo;

import java.util.List;

/**
 * @author YXD
 * @date 2024/8/31
 */
public interface UserInfoService extends IService<UserInfo> {
    List<UserInfo> listUserInfo();
}
