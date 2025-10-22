package com.example.javafxproject.services;

import com.example.javafxproject.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;

public class UsersService {

    public static boolean isUsernameExist(String username) {
        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users");
                ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                return username.equals(rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean createUser(String firstname, String lastname, String username, String password) {
        String sqlQuery = "INSERT INTO users (firstname, lastname, username, password, created_at, updated_at, status) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sqlQuery)
        ) {
            String isoString = Instant.now().toString();

            stmt.setString(1, firstname);
            stmt.setString(2, lastname);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.setString(5, isoString);
            stmt.setString(6, isoString);
            stmt.setInt(7, 1);

            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("✅ A new user was inserted successfully!");
            }

            return true;

        } catch (SQLException exception) {
            System.out.println("❌ Error inserting user:");
            exception.printStackTrace();
            return false;
        }
    }
}
