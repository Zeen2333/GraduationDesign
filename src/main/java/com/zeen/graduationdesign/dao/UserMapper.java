package com.zeen.graduationdesign.dao;

import com.zeen.graduationdesign.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findPage();

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") long id);

    @Select("select * from user where email = #{email}")
    User getUserByEmail(@Param("email") String email);

    @Select("select * from user where email = #{email} and password = #{password} and enable = 1")
    User getUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);

    @Insert("insert into user (name, phone, email, aboutme, password, avatar, type, create_time, enable, agency_id) " +
            "values (#{user.name}, #{user.phone}, #{user.email}, #{user.aboutme}, #{user.password}, #{user.avatar}, #{user.type}, #{user.create_time}, #{user.enable}, #{user.agency_id})")
    void setUser(@Param("user") User user);

    @Delete("delete from user where email = ${email}")
    void deleteUser(@Param("email") String email);

    @Update("update user" +
            "set" +
            "phone = #{user.phone}, " +
            "name = #{user.name}, " +
            "aboutme = #{user.aboutme}, " +
            "password = #{user.password}, " +
            "enable = #{user.enable}" +
            "where email = #{user.email}")
    void updateUser(@Param("user") User user);
}
