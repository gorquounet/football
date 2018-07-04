package fr.football.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import fr.football.pojos.User;
import fr.Service.ConnexionService;
import fr.Utils.DataConnect;

@WebServlet(name = "InscriptionServelet", urlPatterns = ("/Inscription"))
public class InscriptionServlet  extends HttpServlet{

    public static final String VUE = "/WEB-INF/Inscription.jsp";
    public static final String CHAMP_EMAIL  = "email";
    public static final String CHAMP_PASS   = "motdepasse";
    public static final String CHAMP_CONF   = "confirmation";
    public static final String CHAMP_NOM    = "nom";
    public static final String CHAMP_PRENOM = "prenom";
    public static final String CHAMP_ADRESS = "address";
    public static final String CHAMP_CP     = "69003";
    public static final String CHAMP_VILLE  = "ville";
    public static final String CHAMP_NAISS  = "23/06/1996";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Récupération des champs du formulaire. */
        String email        = request.getParameter( CHAMP_EMAIL );
        String motDePasse   = request.getParameter( CHAMP_PASS );
        String confirmation = request.getParameter( CHAMP_CONF );
        String nom          = request.getParameter( CHAMP_NOM );
        String prenom       = request.getParameter( CHAMP_PRENOM);
        String address      = request.getParameter( CHAMP_ADRESS );
        String cp           = request.getParameter( CHAMP_CP);
        String ville        = request.getParameter( CHAMP_VILLE );
        String naiss        = request.getParameter( CHAMP_NAISS );

        try {
            validationEmail( email );
            validationMotsDePasse( motDePasse, confirmation );
            validationNom( nom );
        } catch (Exception e) {
            /* Gérer les erreurs de validation ici. */
        }
    }

    private void validationEmail( String email ) throws Exception {
        if (email != null && email.trim().length() != 0) {
            if (!email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" )) {
                throw new Exception( "Merci de saisir une adresse mail valide." );
            }
        } else {
            throw new Exception( "Merci de saisir une adresse mail." );
        }
    }
    private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception{}
    private void validationNom( String nom ) throws Exception{}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
