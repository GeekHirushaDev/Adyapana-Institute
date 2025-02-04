package com.adyapanainstitute.model;

import java.sql.*;

public class MySQL {
    
    private static Connection connection;
    
    public static void createConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adyapana_institute", "root", "password");
    }
    
    public static ResultSet executeSearch(String query) throws Exception {
        createConnection();
        return connection.createStatement().executeQuery(query);
    }
    
    public static Integer executeIUD(String query) throws Exception {
        createConnection();
        return connection.createStatement().executeUpdate(query);
    }
    
}
