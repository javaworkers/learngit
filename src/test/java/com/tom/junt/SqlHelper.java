package com.tom.junt;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class SqlHelper {
	private static  SqlSessionFactory S_FACTORY = null;
	private static SqlSession session = null;
    public static SqlSessionFactory initFactory() {
    	if (S_FACTORY == null) {
    		String resource = "configs.xml";
    		try {
				InputStream inputStream = Resources.getResourceAsStream(resource);
				S_FACTORY = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	return S_FACTORY;
    }
    @Test
    public void getSqlFactory() {
    	initFactory();
    }
    public static SqlSession getSqlSession() {  
    	if (S_FACTORY == null) {
    		initFactory();
    	} 
    	if (session == null) {
    		session = S_FACTORY.openSession();   		
    	}
    	return session;
    }
    public static  void closeSession() {
		if (session != null) {
			session.close();
			session = null;
		}
	}
}
