package com.zeen.graduationdesign.dao;

import com.zeen.graduationdesign.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findPage();
}
