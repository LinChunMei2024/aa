package com.example.demo.maper;

import com.example.demo.Pojo.student;
import com.example.demo.Pojo.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {
  @Select("select password from user where username=#{username}")
  String a(String username);
  @Insert("insert into user (username,password) values(#{username},#{password})")
  int aa(user user);
}
