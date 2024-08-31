package edu.nf.yxdsso.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.nf.yxdsso.entity.UserInfo;
import edu.nf.yxdsso.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author YXD
 * @date 2024/8/31
 */
@Service("sserInfoDetailService")
public class UserInfoDetailService implements UserDetailsService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        UserInfo userInfo = userInfoMapper.selectOne(queryWrapper);
        if (userInfo != null) {
            return org.springframework.security.core.userdetails.User.builder()
                    .username(userInfo.getUsername())
                    .password(userInfo.getPassword())
                    .authorities("role_admin")
                    .build();
        } else{
            throw new UsernameNotFoundException("用户未找到:" + username);
        }
    }
}
