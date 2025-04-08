package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
        Connection connection;

        Statement statement;

        public conn(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","My@123456");
                statement = connection.createStatement();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public Connection getconnection(){
            return connection;
        }
        public Statement getStatement() {
            return statement;
        }
}
