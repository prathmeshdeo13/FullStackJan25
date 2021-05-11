package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareBatchDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/java19janbatch?characterEncoding=latin1", "root", "password");

        for (int i = 1; i <= 20; i++) {
            String insert = "insert into employee1 (id,name,address) values("+i+",'name"+i+"','address"+i+"')";
            PreparedStatement preparedStatement= connection.prepareStatement(insert);
            preparedStatement.executeUpdate();
        }
    }
}
