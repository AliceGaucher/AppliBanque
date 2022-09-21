package com.banque.beans;

public class Conseillers extends Clients{

    protected boolean ouvertureCompte;
    protected boolean fermetureCompte;
    protected boolean ajoutClients;
    protected boolean suppressionClients;
    protected boolean modificationClients;

    public boolean isOuvertureCompte() {
        return ouvertureCompte;
    }

    public Conseillers(String prenom, String nom, String genre, int age, boolean retrait, boolean versement, boolean affichage, boolean virement, boolean ouvertureCompte, boolean fermetureCompte, boolean ajoutClients, boolean suppressionClients, boolean modificationClients) {
        super(prenom, nom, genre, age, retrait, versement, affichage, virement);

        this.ouvertureCompte = ouvertureCompte;
        this.fermetureCompte = fermetureCompte;
        this.ajoutClients = ajoutClients;
        this.suppressionClients = suppressionClients;
        this.modificationClients = modificationClients;
    }

    public void setOuvertureCompte(boolean ouvertureCompte) {
        this.ouvertureCompte = ouvertureCompte;
    }

    public boolean isFermetureCompte() {
        return fermetureCompte;
    }

    public void setFermetureCompte(boolean fermetureCompte) {
        this.fermetureCompte = fermetureCompte;
    }

    public boolean isAjoutClients() {
        return ajoutClients;
    }

    public void setAjoutClients(boolean ajoutClients) {
        this.ajoutClients = ajoutClients;
    }

    public boolean isSuppressionClients() {
        return suppressionClients;
    }

    public void setSuppressionClients(boolean suppressionClients) {
        this.suppressionClients = suppressionClients;
    }

    public boolean isModificationClients() {
        return modificationClients;
    }

    public void setModificationClients(boolean modificationClients) {
        this.modificationClients = modificationClients;
    }
    @Override
    public String toString () {
        return "prenom:" + prenom + " age:" + age + " genre:" + genre + " capacité de retrait:" + retrait + " capacité de versement:" + versement + " capacité d'affichage des comptes:" + affichage + " capacité de virement" + virement
                + " capacité d'ouverture de comptes:" + ouvertureCompte + " capacité de fermeture de compte:" + fermetureCompte + " capacité de modification des clients:" + modificationClients + " capacité d'ajout de clients:" + ajoutClients + " capacité de suppresion de clients:" + suppressionClients;
    }
}
