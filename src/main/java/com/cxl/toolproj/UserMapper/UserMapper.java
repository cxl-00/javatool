package com.cxl.toolproj.UserMapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cxl.toolproj.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author Chenxiaoling
 * @date 2020/4/7 1:51 下午
 */
@Mapper
@Component
public interface UserMapper extends BaseMapper<User> {

}
