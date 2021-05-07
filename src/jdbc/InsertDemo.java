package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws Exception  {



            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/java19janbatch?characterEncoding=latin1", "root", "password");
            Statement statement = connection.createStatement();


            String insert = "insert into student(id,Name,Address,PinCode) values (3,'Katherine','Nashik','411987')";
            String update = "update student set id='2' where id=1";
            String delete = "delete from employee1 where id=4";


            int i = statement.executeUpdate(insert);

            System.out.println("RowInserted=>" + i);

    }
}
