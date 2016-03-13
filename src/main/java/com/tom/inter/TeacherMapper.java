package com.tom.inter;

import java.util.List;

import com.tom.model.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    List<Teacher> getTeacherInfo(String tName);
}