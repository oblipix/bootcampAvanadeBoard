package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/board"; // URL do banco de dados
        String username = "root"; // Usuário do banco
        String password = "password"; // Senha do banco
        return DriverManager.getConnection(url, username, password);
    }
}
