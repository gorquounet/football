package fr.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {

    public static Connection getConnection() throws SQLException,ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/football";
        String utilisateur = "root";
        String motDePasse = "";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, utilisateur, motDePasse);

        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }


}
