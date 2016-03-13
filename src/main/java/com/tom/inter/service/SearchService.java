package com.tom.inter.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tom.inter.StudentMapper;
import com.tom.inter.TeacherMapper;
import com.tom.model.Student;
import com.tom.model.Teacher;
@Service
public class SearchService {
	@Resource
	private TeacherMapper teacherMapper;
	@Resource
	private StudentMapper studentMapper;
   public List<Teacher>  getTeacherInfo(String tName){	   
	   return teacherMapper.getTeacherInfo(tName);
   }
   public List<Student> getStudentInfo(String sName) {
	return studentMapper.getStudentInfo(sName);
}
}
