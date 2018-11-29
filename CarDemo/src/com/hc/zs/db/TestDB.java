package com.hc.zs.db;

import org.junit.Test;

public class TestDB {
	
	@Test
	public void testDB() {
		System.out.println(DBUtils.getConnection());
		//System.out.println(DBHelper.getConnection());;
	}
}
