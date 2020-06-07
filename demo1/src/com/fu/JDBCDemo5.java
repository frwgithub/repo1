package com.fu;

import java.sql.*;

public class JDBCDemo5 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt =null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","123456");
            String sql = "select * from account";
            stmt =  conn.createStatement();
            resultSet = stmt.executeQuery(sql);
           while(resultSet.next()){
               int id = resultSet.getInt("id");
               String name = resultSet.getString("NAME");
               double balance = resultSet.getDouble("balance");
               System.out.println(id+"  "+name+"     "+balance);


           }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if (resultSet !=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt !=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
