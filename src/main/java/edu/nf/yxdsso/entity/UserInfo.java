package edu.nf.yxdsso.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YXD
 * @date 2024/8/31
 * username VARCHAR(50) NOT NULL PRIMARY KEY,
 * password VARCHAR(100) NOT NULL,
 * enabled BOOLEAN NOT NULL
 */
@Data
@TableName("user_info")
public class UserInfo implements Serializable {
    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("enabled")
    private boolean enabled;


}
