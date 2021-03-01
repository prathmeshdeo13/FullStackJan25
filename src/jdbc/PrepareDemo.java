package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PrepareDemo {
    public static void main(String[] args){
        try {
            int id;
            String name;
            String Address;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the id->");
            id = scanner.nextInt();
            System.out.println("Enter the name->");
            name = scanner.next();
            System.out.println("Enter the Address->");
            Address = scanner.next();

            String insert = "Insert into employee(id,name,address) values(?,?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java19janbatch?characterEncoding=latin1", "root", "password");
            PreparedStatement statement = connection.prepareCall(insert);


            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, Address);

            statement.executeUpdate();
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
