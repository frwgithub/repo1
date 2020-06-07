package com.fu;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
jdbc 的工具类
* */
public class JDBCUtils {
    //获取连接
    private static String url ;
    private static String user ;
    private static String driver ;
    private static String password ;

    //静态代码块
    static {
        try {
            //将文件数据读入
            Properties pro = new Properties();
           //获取src路径下的文件的方式 --》ClassLoader
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL resource = classLoader.getResource("JDBC.properties");
            String path = resource.getPath();
            System.out.println(path);
            pro.load(new FileReader(path));
            //加载文件
            pro.load(new FileReader("src/JDBC.properties"));
            //获取数据
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url,user,password);
    }
    //资源释放
    public static void close(Statement stmt , Connection conn){
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    }

    public static void close(ResultSet rs, Statement stmt , Connection con){
        if(rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt !=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
