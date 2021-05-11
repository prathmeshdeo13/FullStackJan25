package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/java19janbatch?characterEncoding=latin1", "root","password");
        String insert = "insert into employee (id,name,address) values(?,?,?)";
        PreparedStatement preparedStatement= connection.prepareStatement(insert);

        for (int i = 1; i <= 20; i++) {
        preparedStatement.setInt(1,i);
        preparedStatement.setString(2,"name");
        preparedStatement.setString(3,"address");
        preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        System.out.println("Successfully Executed......");
    }
}
