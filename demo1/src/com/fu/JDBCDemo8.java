package com.fu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo8 {
    public List<Emp> findAll(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet  resultSet =null;
        Emp emp = null;
        List<Emp> list = new ArrayList<Emp>();
        try {
             conn = JDBCUtils.getConnection();
            String sql = "select * from emp";
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                int job_id = resultSet.getInt("job_id");
                int mgr = resultSet.getInt("mgr");
                Date joinDate = resultSet.getDate("joinDate");
                double salary = resultSet.getDouble("salary");
                double bonus = resultSet.getDouble("bonus");
                int dept_id = resultSet.getInt("dept_id");
                emp =new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoinDate(joinDate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,stmt,conn );
            }
        return list;
    }

    public static void main(String[] args) {
        List<Emp> empList = new JDBCDemo8().findAll();
        System.out.println(empList);
    }
}
