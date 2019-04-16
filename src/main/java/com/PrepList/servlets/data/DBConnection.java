package com.PrepList.servlets.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    protected static Connection initializeDatabase()
        throws SQLException, ClassNotFoundException
    {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "com.mariadb.jdbc.Driver";
        String dbURL = "jdbc:mariadb:// localhost:3306/";
        // Database name to access
        String dbName = "PrepList";
        String dbUsername = "PrepList";
        String dbPassword = "whoitare";

        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                dbUsername, dbPassword);
        return con;
    }
}
