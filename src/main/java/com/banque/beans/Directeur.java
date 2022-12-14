package com.banque.beans;

public class Directeur extends Conseillers{

    protected boolean ajoutAgence;
    protected boolean suppressionAgence;
    protected boolean modificationAgence;
    protected boolean ajoutConseillers;
    protected boolean suppressionConseillers;
    protected boolean modificationConseillers;

    public Directeur(String prenom, String nom, String genre, int age, boolean retrait, boolean versement, boolean affichage, boolean virement, boolean ouvertureCompte, boolean fermetureCompte, boolean ajoutClients, boolean suppressionClients, boolean modificationClients, boolean ajoutAgence, boolean suppressionAgence, boolean modificationAgence, boolean suppressionConseillers, boolean ajoutConseillers, boolean modificationConseillers) {
        super(prenom, nom, genre, age, retrait, versement, affichage, virement, ouvertureCompte, fermetureCompte, ajoutClients, suppressionClients, modificationClients);
        this.ajoutAgence = ajoutAgence;
        this.suppressionAgence = suppressionAgence;
        this.modificationAgence = modificationAgence;
        this.ajoutConseillers = ajoutConseillers;
        this.suppressionConseillers = suppressionConseillers;
        this.modificationConseillers = modificationConseillers;
    }

    public boolean isAjoutAgence() {
        return ajoutAgence;
    }

    public void setAjoutAgence(boolean ajoutAgence) {
        this.ajoutAgence = ajoutAgence;
    }

    public boolean isSuppressionAgence() {
        return suppressionAgence;
    }

    public void setSuppressionAgence(boolean suppressionAgence) {
        this.suppressionAgence = suppressionAgence;
    }

    public boolean isModificationAgence() {
        return modificationAgence;
    }

    public void setModificationAgence(boolean modificationAgence) {
        this.modificationAgence = modificationAgence;
    }

    public boolean isAjoutConseillers() {
        return ajoutConseillers;
    }

    public void setAjoutConseillers(boolean ajoutConseillers) {
        this.ajoutConseillers = ajoutConseillers;
    }

    public boolean isSuppressionConseillers() {
        return suppressionConseillers;
    }

    public void setSuppressionConseillers(boolean suppressionConseillers) {
        this.suppressionConseillers = suppressionConseillers;
    }

    public boolean isModificationConseillers() {
        return modificationConseillers;
    }

    public void setModificationConseillers(boolean modificationConseillers) {
        this.modificationConseillers = modificationConseillers;
    }
    @Override
    public String toString () {
        return "prenom:" + prenom + " age:" + age + " genre:" + genre + " capacit?? de retrait:" + retrait + " capacit?? de versement:" + versement + " capacit?? d'affichage des comptes:" + affichage + " capacit?? de virement" + virement
                + " capacit?? d'ouverture de comptes:" + ouvertureCompte + " capacit?? de fermeture de compte:" + fermetureCompte + " capacit?? de modification des clients:" + modificationClients + " capacit?? d'ajout de clients:" + ajoutClients + " capacit?? de suppresion de clients:" + suppressionClients + " capacit?? d'ajout d'agence:" + ajoutAgence + " capacit?? de suppresssion d'agence:" + suppressionAgence + " capacit?? de mofication d'agence:" + modificationAgence + " capacit?? d'ajout de conseiller:" + ajoutConseillers + " capacit?? de suppression de conseiller:" + suppressionConseillers + " capacit?? de modification de conseiller:" + modificationConseillers;
    }
}
