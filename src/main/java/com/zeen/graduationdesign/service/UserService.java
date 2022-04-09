package com.zeen.graduationdesign.service;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Strings;
import com.zeen.graduationdesign.dao.UserMapper;
import com.zeen.graduationdesign.entity.User;
import com.zeen.graduationdesign.util.MybatisPageHelper;
import com.zeen.graduationdesign.util.PageRequest;
import com.zeen.graduationdesign.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private UserMapper userMapper;

    @Value("139.129.221.100:8081/images")
    private String imgPrefix;

    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, userMapper);
    }

    public User getUserById(Long id) {
        String key = "user:"+id;
        String json =  redisTemplate.opsForValue().get(key);
        User user = null;
        if (Strings.isNullOrEmpty(json)) {
            user = userMapper.getUserById(id);
            user.setAvatar(imgPrefix + user.getAvatar());
            String string  = JSON.toJSONString(user);
            redisTemplate.opsForValue().set(key, string);
            redisTemplate.expire(key, 5, TimeUnit.MINUTES);
        }else {
            user = JSON.parseObject(json,User.class);
        }
        return user;
    }
}
