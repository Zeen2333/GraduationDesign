package com.zeen.graduationdesign.service.Impl;

import com.zeen.graduationdesign.dao.UserMapper;
import com.zeen.graduationdesign.entity.User;
import com.zeen.graduationdesign.service.UserService;
import com.zeen.graduationdesign.util.MybatisPageHelper;
import com.zeen.graduationdesign.util.PageRequest;
import com.zeen.graduationdesign.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, userMapper);
    }

}
