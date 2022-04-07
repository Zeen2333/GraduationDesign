package com.zeen.graduationdesign.service;

import com.zeen.graduationdesign.entity.User;
import com.zeen.graduationdesign.util.PageRequest;
import com.zeen.graduationdesign.util.PageResult;

import java.util.List;

public interface UserService {

    PageResult findPage(PageRequest pageRequest);
}
