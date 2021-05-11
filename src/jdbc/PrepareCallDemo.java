package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PrepareCallDemo {
    public static void main(String[] args)throws  Exception {

        int id;
        String name;
        String address;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id=>");
        id = scanner.nextInt();
        System.out.println("Enter name=>");
        name = scanner.next();
        System.out.println("Enter address=>");
        address = scanner.next();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/java19janbatch?characterEncoding=latin1", "root", "password");
       // PreparedStatement preparedStatement = connection.prepareCall("Call getData()");
        CallableStatement callableStatement= connection.prepareCall("Call InsertEmp(?,?,?)");
      //  preparedStatement.executeUpdate();
       // System.out.println("Execute Successfully..... ");

        callableStatement.setInt(1,id);
        callableStatement.setString(2,name);
        callableStatement.setString(3,address);

        callableStatement.executeUpdate();
        System.out.println("Execute Succesfully");


    }
}
