package com.example.yiyuan1;

import com.example.yiyuan1.entiy.User;
import com.example.yiyuan1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Yiyuan1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public  void contextLoads() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }
    @Test
    public  void contextLoads1() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);

    }

}
