package com.tom.inter;

import java.util.List;

import com.tom.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> getStudentInfo(String sName);
}