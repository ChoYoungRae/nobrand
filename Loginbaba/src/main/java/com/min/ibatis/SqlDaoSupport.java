package com.min.ibatis;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlDaoSupport {

	private static SqlMapClient sqlMapClient;
	
	static{
		try {
			String path="com/min/ibatis/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(path);
			sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}
	
	
}
