package edu.nf.yxdsso.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.nf.yxdsso.entity.UserInfo;
import edu.nf.yxdsso.mapper.UserInfoMapper;
import edu.nf.yxdsso.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YXD
 * @date 2024/8/31
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> listUserInfo() {
        return userInfoMapper.listUserInfo();
    }
}
