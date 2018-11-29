package com.hc.zs.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
  
public class DBUtils {
	private static Properties p = new Properties();//该类的作用是操作配置文件（.properties格式的配置文件）
	private static DBUtils d = new DBUtils();
	//使用p对象加载目标配置文件(dbinit.properties)
	//第一种加载 p.load(new inputstream("c:/dbinit.properties"));不用。原因失去了跨平台性。
	//第二种加载 获取DBUtils类所在的路径 + dbinit.properties 类路径（能找到类就能找到配置文件）常用
	//配置文件的加载最好只加载一次 static块中
	static{
		try {
			//p.load(new FileInputStream("c:/dbinit.properties"));
			p.load(d.getClass().getResourceAsStream("dbinit.properties"));//第二种加载方式 : 类路径获取配置文件
			//要求：DBUtils必须与dbinit.properties在同一目录下才可以使用第二种加载方式
		} catch (Exception e) {
			System.out.println("文件未找到异常" + e.getMessage());
		}
	}
	
	
	public static Connection getConnection(){
		//提取配置文件中的数据库连接项 6个 
		String dbtype = p.getProperty("dbtype");//使用那种数据库 -- 数据库类型
		String driver = p.getProperty("driverClassName");
		String url = p.getProperty("url");
		String username = p.getProperty("username");//用户名                            
		String password=  p.getProperty("password");//密码 
		
		//声明 一个 connection 
		Connection con = null;
		//判断要连接数据库的种类
		if(dbtype.trim().equalsIgnoreCase("mysql")){
			 //mysql
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(
						url,username.trim(), username.trim());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		   //sqlserver
		   //sqlserver默认的端口是1433，默认是不打开的。window server版才会默认打开1433
		   //如何打开端口 ： 使用sp3补丁 来打开1433端口
		return con;
	}
	
	
	public static void close(Connection con , PreparedStatement pstam ,ResultSet rs){
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		if(pstam != null){
			try {
				pstam.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
