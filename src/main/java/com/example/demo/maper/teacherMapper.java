package com.example.demo.maper;

import com.example.demo.Pojo.student;
import com.example.demo.Pojo.teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface teacherMapper {
    @Select("select * from teacher")
    List<teacher> selectAll();
    @Select("select * from teacher where tname=#{tname}")
    teacher selectOne(String tname);
    @Insert("insert into teacher(tid,tname) values(#{tid},#{tname})")
    void addTeacher(String tid,String tname);
    @Update("update teacher set tid=#{tid},tname=#{tname} where tid=#{tid2}")
    int xiugai(String tid,String tname,String tid2);
    @Delete("delete from teacher where tid=#{a}")
    int aaa(String a);
}
