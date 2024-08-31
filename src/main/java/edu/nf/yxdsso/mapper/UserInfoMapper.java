package edu.nf.yxdsso.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.nf.yxdsso.entity.UserInfo;

import java.util.List;

/**
 * @author YXD
 * @date 2024/8/31
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    List<UserInfo> listUserInfo();
}
