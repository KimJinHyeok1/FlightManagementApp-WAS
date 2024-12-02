package com.example.flightmanagementapp.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

    @Test
    public void ConnectionTest() throws Exception {

        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/FlightManagementApp",
                "root",
                "1234");

        Assertions.assertNotNull(connection);

        connection.close();
    }
}
