package fr.football.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
    public static final String ATT_ERREURS  = "erreurs";
    public static final String ATT_RESULTAT = "resultat";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String resultat;
        Map<String, String> erreurs = new HashMap<String, String>();

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


        /* Validation du champ email. */
        try {
            validationEmail( email );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_EMAIL, e.getMessage() );
        }

        /* Validation des champs mot de passe et confirmation. */
        try {
            validationMotsDePasse( motDePasse, confirmation );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_PASS, e.getMessage() );
        }

        /* Validation du champ nom. */
        try {
            validationNom( nom );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_NOM, e.getMessage() );
        }

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'inscription.";
        } else {
            resultat = "Échec de l'inscription.";
        }

        /* Stockage du résultat et des messages d'erreur dans l'objet request */
        request.setAttribute( ATT_ERREURS, erreurs );
        request.setAttribute( ATT_RESULTAT, resultat );

        /* Transmission de la paire d'objets request/response à notre JSP */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );

        /* Création de l'objet gérant les requêtes */

        }
    }


    private void inscriptionJoueur(String pNom, String pPrenom, String pEmail, String pMotDePasse, String pNiveau, String pVille ) {
        User player = null;
        try (Connection connection = DataConnect.getConnection()) {
            VilleService villeService = new VilleService(connection);
            Ville ville = villeService.getVilleFromNom(pVille);
            player = new Joueur(pEmail,pNom,pPrenom,pMotDePasse,ville.getId(),pNiveau);
            connection.close();
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DataConnect.getConnection()) {
            JoueurService joueurService = new JoueurService(connection);
            joueurService.createJoueur(player);
            connection.close();
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private List<Ville> getAllVille(){
        List<Ville> villes = new ArrayList<Ville>();
        try (Connection connection = DataConnect.getConnection()) {
            VilleService villeService = new VilleService(connection);
            villes = villeService.getAll();
            connection.close();
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return villes;
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
    /**
     * Valide les mots de passe saisis.
     */
    private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception{
        if (motDePasse != null && motDePasse.trim().length() != 0 && confirmation != null && confirmation.trim().length() != 0) {
            if (!motDePasse.equals(confirmation)) {
                throw new Exception("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
            } else if (motDePasse.trim().length() < 3) {
                throw new Exception("Les mots de passe doivent contenir au moins 3 caractères.");
            }
        } else {
            throw new Exception("Merci de saisir et confirmer votre mot de passe.");
        }
    }
    private void validationNom( String nom ) throws Exception {
        if ( nom != null && nom.trim().length() < 3 ) {
            throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
