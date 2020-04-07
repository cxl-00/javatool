package com.cxl.toolproj.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Chenxiaoling
 * @date 2020/4/7 1:54 下午
 */
@TableName("t_sys_user")
@Getter
@Setter
public class User extends Model<User> {
    Long id;

    String username;

    String password;

    @TableField("del_flag")
    Integer   delFlag;
    @TableField("created_at")
    Timestamp createdAt;
    @TableField("updated_at")
    Timestamp updatedAt;

    protected Serializable pkVal() {
        return this.id;
    }
}
