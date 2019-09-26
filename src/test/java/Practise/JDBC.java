package Practise;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://"+"localhost"+":"+"3306"+"/QADBT","root","root");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Employeeinfo where name = 'sam'");

            resultSet.next();

            String id = resultSet.getString("id");

            System.out.println("id"+id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
