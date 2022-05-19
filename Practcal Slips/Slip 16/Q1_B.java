// Write a Java program to accept the details of students (rno, sname, per) at least 5 Records, store it into database and display the details of student having highest percentage. (Use PreparedStatement Interface)


import java.util.*;
import java.sql.*;

class Q1_B {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?)");

            Scanner sc = new Scanner(System.in);
            for(int i = 1; i < 3; i++) {
                System.out.println("Enter the Student Number");
                int id = sc.nextInt();
                System.out.println("Enter the Student Name");
                String name = sc.next();
                System.out.println("Enter the Student Percentage");
                float per = sc.nextFloat();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setFloat(3, per);
                ps.executeUpdate();
                System.out.println("Record Inserted");
            }
            //print highest percentage
            PreparedStatement ps1 = con.prepareStatement("select * from students where per = (select max(per) from students)");
            ResultSet rs =ps1.executeQuery();
            while (rs.next()) {
                System.out.println("Student with Number :"+rs.getInt(1));
                System.out.println("Student with Name :"+rs.getString(2));
                System.out.println("Student with Percentage :"+rs.getFloat(3));
            }
            rs.close();
            ps1.close();
            // System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}