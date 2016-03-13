package com.tom.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.tom.bean.User;
import com.tom.junt.SqlHelper;

public class ForEachTest {
    public static void main(String[] args) {
    	SqlSession session = SqlHelper.getSqlSession();
    	Map<String, Object> maps = new HashMap<String, Object>();
    	List<Integer> list = new ArrayList<Integer>();
    	maps.put("name","州");
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	maps.put("lists",list);
    	List<User> list2 = session.selectList("com.tom.mapper.UsersMapper.getInfoByParam", maps);
    	for (User user : list2)
    		System.out.println(user);
	}
}
