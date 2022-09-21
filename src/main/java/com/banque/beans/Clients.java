package com.banque.beans;

public class Clients {

    public String prenom;
    public String nom;
    protected String genre;
    protected int age;
    protected boolean retrait;
    protected boolean versement;
    protected boolean affichage;
    protected boolean virement;

    public Clients(String prenom, String nom, String genre, int age, boolean retrait, boolean versement, boolean affichage, boolean virement){
        this.prenom = prenom;
        this.nom = nom;
        this.genre = genre;
        this.age = age;
        this.retrait = retrait;
        this.versement = versement;
        this.affichage = affichage;
        this.virement = virement;
    }

    public boolean isRetrait() {
        return retrait;
    }

    public void setRetrait(boolean retrait) {
        this.retrait = retrait;
    }

    public boolean isVersement() {
        return versement;
    }

    public void setVersement(boolean versement) {
        this.versement = versement;
    }

    public boolean isAffichage() {
        return affichage;
    }

    public void setAffichage(boolean affichage) {
        this.affichage = affichage;
    }

    public boolean isVirement() {
        return virement;
    }

    public void setVirement(boolean virement) {
        this.virement = virement;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "prenom:" + prenom + " age:" + age + " genre:" + genre + " capacité de retrait:" + retrait + " capacité de versement:" + versement + " capacité d'affichage des comptes:" + affichage + " capacité de virement" + virement;
    }

}
