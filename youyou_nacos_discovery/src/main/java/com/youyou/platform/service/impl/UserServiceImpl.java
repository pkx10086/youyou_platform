package com.youyou.platform.service.impl;


import com.youyou.platform.entity.User;
import com.youyou.platform.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

/**
 * @author RC
 * @description 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        //throw new RuntimeException("num值太大");
        // 直接编写业务逻辑
        return "success";
    }
}
