package fr.football.servlet;


mport java.io.IOException;
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

    private static final long serialVersionUID = 1L;

    private static final String CHAMP_NOM   = "nom";
    private static final String CHAMP_PRENOM   = "prenom";
    public static final String CHAMP_EMAIL = "email";
    private static final String CHAMP_PASS   = "password";
    private static final String CHAMP_NIVEAU   = "niveau";
    private static final String CHAMP_VILLE   = "ville";
    public static final String CHAMP_CP= "cp";
    public static final String CHAMP_ADDRESS ="address";
    public InscriptionServelets() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String resultat;
        Map<String, String> erreurs = new HashMap<String, String>();

        String nom = request.getParameter(CHAMP_NOM);
        String prenom = request.getParameter(CHAMP_PRENOM);
        String email =  request.getParameter(CHAMP_EMAIL);
        String motDePasse = request.getParameter(CHAMP_PASS);
        String niveau = request.getParameter(CHAMP_NIVEAU);
        String ville = request.getParameter(CHAMP_VILLE);


        try {
            validationEmail( email );
        } catch ( Exception e ) {
            erreurs.put( CHAMP_EMAIL, e.getMessage() );
        }
        if ( erreurs.isEmpty() ) {
            inscriptionJoueur(nom,prenom,email,motDePasse,niveau,ville);
            response.sendRedirect("/EnglishBattle/");
        } else {
            resultat = "�chec de l'inscription.";
            request.setAttribute( "erreurs", erreurs );
            request.setAttribute( "resultat", resultat );
            doGet( request, response );
        }

        private void validationEmail( String email ) throws Exception {
            if (!email.isEmpty()) {
                if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                    throw new Exception( "Merci de saisir une adresse mail valide." );
                }
            } else {
                throw new Exception( "Merci de saisir une adresse mail." );
            }
        }

        private void inscriptionJoueur() {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/Inscription.jsp").forward(request, response);
    }
}
