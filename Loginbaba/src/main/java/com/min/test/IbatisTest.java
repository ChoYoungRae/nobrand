package com.min.test;

import org.apache.log4j.Logger;

import com.min.ibatis.SqlDaoSupport;

public class IbatisTest {
	
	public static void main(String[] args) {
		SqlDaoSupport.getSqlMapClient();
	}

}
