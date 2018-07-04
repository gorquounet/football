package fr.football.pojos;

import java.util.Date;

public class User {
    private Long id;
    private String email;
    private String nom;
    private String prenom;
    private String motDePasse;
    private String cp;
    private String address;
    private String ville;
    private Date   naiss;

    public User ( String email, String nom, String prenom, String motDePasse, String cp, String address, String ville, Date naiss ) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.cp = cp;
        this.address = address;
        this.ville = ville;
        this.naiss = naiss;
    }


}
