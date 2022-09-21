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
        return "prenom:" + prenom + " age:" + age + " genre:" + genre + " capacité de retrait:" + retrait + " capacité de versement:" + versement + " capacité d'affichage des comptes:" + affichage + " capacité de virement" + virement
                + " capacité d'ouverture de comptes:" + ouvertureCompte + " capacité de fermeture de compte:" + fermetureCompte + " capacité de modification des clients:" + modificationClients + " capacité d'ajout de clients:" + ajoutClients + " capacité de suppresion de clients:" + suppressionClients + " capacité d'ajout d'agence:" + ajoutAgence + " capacité de suppresssion d'agence:" + suppressionAgence + " capacité de mofication d'agence:" + modificationAgence + " capacité d'ajout de conseiller:" + ajoutConseillers + " capacité de suppression de conseiller:" + suppressionConseillers + " capacité de modification de conseiller:" + modificationConseillers;
    }
}
