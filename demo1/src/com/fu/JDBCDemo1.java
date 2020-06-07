package com.fu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///db2", "root", "123456");

        String sql ="update account set balance = 25100 where id = 1";
        String sql1 ="insert into account (id,name,balance) values(3,'liganng',1200)";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        statement.executeUpdate(sql1);
        System.out.println(i);
        statement.close();
        connection.close();


    }
}
