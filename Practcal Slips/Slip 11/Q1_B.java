//  Write a Java program to display sales details of Product (PID, PName, Qty, Rate, Amount) between two selected dates. (Assume Sales table is already created).

import java.sql.*;
import java.util.*;


public class Q1_B {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            PreparedStatement ps = con.prepareStatement("select * from sales where sdate between ? and ?");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Start Date");
            String sdate = sc.next();
            System.out.println("Enter the End Date");
            String edate = sc.next();
            ps.setString(1, sdate);
            ps.setString(2, edate);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Product ID :"+rs.getInt(1));
                System.out.println("Product Name :"+rs.getString(2));
                System.out.println("Quantity :"+rs.getInt(3));
            }
            rs.close();
            ps.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
