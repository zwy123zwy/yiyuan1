package com.example.yiyuan1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.yiyuan1.entiy.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
