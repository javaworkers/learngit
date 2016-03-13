package com.tom.util;

import java.util.Map;

public class SelectSqlHelper {
   public String getSelectUserSql(Map<String, String> map) {
	   String sql = "select * from user ";
	   if (map.get("sex")!=null){
		   sql+=" where sex='"+map.get("sex")+"'";
	   }
	   if (map.get("param2")!=null) {
		   sql+=" and name like '%"+map.get("1")+"%'";
	   }
	   return sql;
   }
}
