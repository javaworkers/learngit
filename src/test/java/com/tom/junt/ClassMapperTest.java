package com.tom.junt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.tom.VO.VOUser;
import com.tom.bean.Classes;
import com.tom.bean.User;
import com.tom.mapper.ClassesMapper;

public class ClassMapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SqlSessionFactory factory =	SqlHelper.initFactory();
		//Classes classes = factory.openSession().getMapper(ClassesMapper.class).getClassInfo(1);
		//Classes classes = factory.openSession().selectOne("com.tom.mapper.ClassesMapper.getClassInfo2", 1);		
		//Classes classes = factory.openSession().selectOne("com.tom.mapper.ClassesMapper2.getClassInfo", 1);
		//Classes classes = factory.openSession().selectOne("com.tom.mapper.ClassesMapper2.getClassInfo2", 1);
		SqlSession session = factory.openSession();
		//List<User> users = session.selectList("com.tom.mapper.UserMapper.getUserInfo",new VOUser("州", 19,26));
		Map<String,Integer> parameterMap = new HashMap<String, Integer>();
		parameterMap.put("sexId",1);
		parameterMap.put("sexcount",-1);
		session.selectOne("com.tom.mapper.UserMapper.getUserCount", parameterMap);
		System.out.println(parameterMap.get("sexcount"));
		session.close();
	}

}
