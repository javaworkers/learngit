package com.tom.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tom.inter.service.SearchService;
import com.tom.model.Student;
import com.tom.model.Teacher;

@Controller
@RequestMapping("search")
public class SearchController {
	@Autowired
	private SearchService searchService;
	@ResponseBody
    @RequestMapping("/getSearchResult")
	public List<?> getSearchItemResult(String value, String name, HttpServletResponse response, Model model,HttpServletRequest request) {
		List<Teacher> teacher = null;
		List<Student> student = null;
		if ("teacher".equals(name)) {
			teacher = searchService.getTeacherInfo(value);
		} else if ("student".equals(name)) {
			student = searchService.getStudentInfo(value);
		}
		if (teacher != null && !teacher.isEmpty()) {
		     return teacher;
		} else if (student!= null && !student.isEmpty()) {
			 return student;
		}
		return null;
	}
}
