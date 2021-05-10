package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
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
        PreparedStatement preparedStatement = connection.prepareCall("?,?,?");
      //  preparedStatement.executeUpdate();
       // System.out.println("Execute Successfully..... ");

        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,address);
        System.out.println("Execute Succesfully");

    }
}
