package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) throws Exception{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java19janbatch?characterEncoding=latin1", "root", "password");
            Statement statement =connection.createStatement();
            ResultSet rs=statement.executeQuery("select * from Employee1");

            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }


        }
    }

