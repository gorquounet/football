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

    public Long getId () {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

    public String getEmail () {
        return email;
    }

    public String getNom () {
        return nom;
    }

    public String getPrenom () {
        return prenom;
    }

    public String getMotDePasse () {
        return motDePasse;
    }

    public String getCp () {
        return cp;
    }

    public String getAddress () {
        return address;
    }

    public String getVille () {
        return ville;
    }

    public Date getNaiss () {
        return naiss;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public void setNom ( String nom ) {
        this.nom = nom;
    }

    public void setPrenom ( String prenom ) {
        this.prenom = prenom;
    }

    public void setMotDePasse ( String motDePasse ) {
        this.motDePasse = motDePasse;
    }

    public void setCp ( String cp ) {
        this.cp = cp;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public void setVille ( String ville ) {
        this.ville = ville;
    }

    public void setNaiss ( Date naiss ) {
        this.naiss = naiss;
    }
    public String toString() {
        return "User [email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", motDePasse=" + motDePasse + "]";
    }



}
