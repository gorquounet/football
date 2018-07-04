package fr.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.football.pojos.User;

import javax.jws.soap.SOAPBinding;

public class UserService {
    private Connection connection;

    public UserService(Connection connection) {

        this.connection = connection;
    }

    public User getJoueurFromId( Long id) throws SQLException {

        User joueur = null;

        String query = "select * from _user where id = ?";

        PreparedStatement psmt = connection.prepareStatement(query);

        psmt.setLong(1, id);

        ResultSet rs = psmt.executeQuery();

        if (rs.next()) {

            joueur = new User(rs.getString("email"),
                    rs.getString("nom_use"),
                    rs.getString("prenom_use"),
                    rs.getString("mdp_use"),
                    rs.getString( "cp_use" ),
                    rs.getString("adresse_use"),
                    rs.getString( "ville_use" ),
                    rs.getDate( "naiss_use" ));


            joueur.setId(rs.getLong(1));
        }

        rs.close();
        psmt.close();

        return joueur;

    }
}
