package com.tom.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.tom.bean.User;
import com.tom.util.SelectSqlHelper;

public interface UsersMapper {

  @Select("select * from user where id=#{id}")
  User getUserInfos (int id);
  @Insert("insert into user (name,sex,age) values(#{name},#{sex},#{age})")
  boolean insertUserInfo(User user);
  @Delete("delete from user where id=#{id}")
  boolean deleteUserInfo(int id);
  @Update("update user set name=#{name} where id=#{id}")
  boolean updateUserInfo(User user);
  @SelectProvider(type=SelectSqlHelper.class,method="getSelectUserSql")
  @ResultMap(value = "userMap" )
  List<User> findUserInfo(@Param(value = "sex") String sex, String name);
}
