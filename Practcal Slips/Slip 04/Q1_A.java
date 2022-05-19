//  Write a Java Program to delete details of students whose initial character of their name is ‘S’

import java.sql.*;


class Q1_A {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            Statement stmt = con.createStatement();
            String sql = "delete from student where sname like 'S%'";
            stmt.executeUpdate(sql);
            System.out.println("Deleted Successfully");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}