package com.dija.myexapp;

public class Personne {

    private String nom;
    private String prenom;
    private String age;

    // --- CONSTRUCTOR ---
    public Personne(String nom, String prenom, String age) {
       this.nom = nom;
       this.prenom = prenom;
       this.age = age;
    }

    // --- SETTERS ---
    public void  setNom(String nom) {
        this.nom = nom;
        }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
        }
    public void setAge(String age) {
        this.age = age;
        }


     // --- GETTERS ---
    public String presentezVous() {
        return nom + prenom + age ;
    }
    public String quelEstVotreNom() {
        return nom;
    }
    public String quelEstVotreAge() {
        return age;
    }

}