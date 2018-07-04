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
                    rs.getString( "naiss_use" ));


            joueur.setId(rs.getLong(1));
        }

        rs.close();
        psmt.close();

        return joueur;

    }

    public List<User> getAllJoueurs() throws SQLException {

        List<User> joueurs = new ArrayList<User>();
        User joueur = null;


        String query = "select * from _user";

        PreparedStatement psmt = connection.prepareStatement(query);

        ResultSet rs = psmt.executeQuery();

        while(rs.next()) {

            joueur = new User(rs.getString("email"),
                    rs.getString("nom_use"),
                    rs.getString("prenom_use"),
                    rs.getString("mdp_use"),
                    rs.getString( "cp_use" ),
                    rs.getString("adresse_use"),
                    rs.getString( "ville_use" ),
                    rs.getString( "naiss_use" ));

            joueur.setId(rs.getLong(1));

            joueurs.add(joueur);
        }

        rs.close();
        psmt.close();

        return joueurs;

    }

    public User getJoueurFromEmailAndPassword(String email, String password) throws SQLException {

        User joueur = null;

        String query = "select * from _user where mail_use = ? and mdp_use = ?";

        PreparedStatement psmt = connection.prepareStatement(query);

        psmt.setString(1, email);
        psmt.setString(2, password);

        ResultSet rs = psmt.executeQuery();

        if (rs.next()) {

            joueur = new User(rs.getString("email"),
                    rs.getString("nom_use"),
                    rs.getString("prenom_use"),
                    rs.getString("mdp_use"),
                    rs.getString( "cp_use" ),
                    rs.getString("adresse_use"),
                    rs.getString( "ville_use" ),
                    rs.getString( "naiss_use" ));

            joueur.setId(rs.getLong(1));
        }

        rs.close();
        psmt.close();

        return joueur;

    }

    public User createJoueur(User joueur) throws SQLException {

        String query = "insert into _user (nom_use, prenom_use, adresse_use, cp_use, ville_use, naisse_use, mail_use, mdp_use) "
                + " values (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement psmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        psmt.setString(7,joueur.getEmail());
        psmt.setString(1,joueur.getNom());
        psmt.setString(2, joueur.getPrenom());
        psmt.setString(3, joueur.getPrenom());
        psmt.setString(4, joueur.getAddress());
        psmt.setString(5, joueur.getCp());
        psmt.setString(6, joueur.getVille());
        psmt.setString(7, joueur.getNaiss());
        psmt.setString(8, joueur.getMotDePasse() );

        psmt.executeUpdate();

        ResultSet rs = psmt.getGeneratedKeys();

        if (rs.first()) {
            joueur.setId(rs.getLong(1));
        }

        rs.close();
        psmt.close();

        return joueur;
    }
}
