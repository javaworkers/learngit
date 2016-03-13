package com.tom.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.tom.bean.User;
import com.tom.junt.SqlHelper;
import com.tom.mapper.UsersMapper;

public class AnnocationTest {
  public static void main(String[] args) {
	SqlSession session = SqlHelper.getSqlSession();
	User user = session.getMapper(UsersMapper.class).getUserInfos(1);
	System.out.println(user);
	user.setName("哇哈哈");
	/*User user = new User("阿娜", "女",19);
	boolean flag = session.getMapper(UsersMapper.class).insertUserInfo(user);*/
	//boolean flag = session.getMapper(UsersMapper.class).deleteUserInfo(6);
	/*boolean flag = session.getMapper(UsersMapper.class).updateUserInfo(user);
	session.commit();
	System.out.println(flag);*/
	/*List<User> list = session.getMapper(UsersMapper.class).findUserInfo("男","州");
	for (User user2 : list)
		System.out.println(user2);*/
	
	User user2 = session.selectOne("com.tom.mapper.UsersMapper.getUserInfoByParam", new User(-1,"晓","女",13));
	System.out.println(user2);
	session.close();
  }
}
