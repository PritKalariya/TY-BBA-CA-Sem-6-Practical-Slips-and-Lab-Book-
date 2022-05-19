//  Write a Java Program to create a Emp (ENo, EName, Sal) table and insert record into it. (Use PreparedStatement Interface)

import java.sql.*;
import java.util.Scanner;


public class Q1_A {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Employee Number");
            int id = sc.nextInt();
            System.out.println("Enter the Employee Name");
            String name = sc.next();
            System.out.println("Enter the Employee Salary");
            int sal = sc.nextInt();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, sal);

            ps.executeUpdate();
            System.out.println("Record Inserted");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
