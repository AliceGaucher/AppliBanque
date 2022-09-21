package com.banque.beans.actions;

import com.banque.beans.Conseillers;
import com.banque.beans.Directeur;

import java.util.Scanner;

public class OperationDirecteur {
    public void operationDirecteur() {
        int i = 0;
        while (i < 99) {
            System.out.println("Vous avez choisis d'être un Directeur");
            Directeur directeur = new Directeur("Master", "Chief", "Femme", 20, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true);
            System.out.println("Bonjour " + directeur.prenom + " " + directeur.nom);

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Veuillez choisir un type d'opération : 1(Retrait) - 2(Versement) - 3(Affichage des comptes) - 4(Ouverture de Compte) - 5(Fermeture de Compte) - 6(Ajout de Client) - 7(Supression de Client) - 8(Modification de Client) - 9(Ajout d'agence) - 10(Suppression d'agence) - 11(Modification d'agence) - 12(Ajout de Conseiller) - 13(Suppression de Conseiller) - 14(Modification de Conseiller) - 15(Quitter)");
            int operation = Integer.parseInt(scanner2.next());

            if (operation == 1) {
                System.out.println("Vous avez choisis l'opération Retrait");
                Retrait retrait = new Retrait();
                retrait.retrait();

            }

            if (operation == 2) {
                System.out.println("Vous avez choisis l'opération Versement");
                Versement versement = new Versement();
                versement.versement();
            }

            if (operation == 3) {
                System.out.println("Vous avez choisis l'opération Affichage des comptes");
                Affichage affichage = new Affichage();
                affichage.afficher();
            }

            if (operation == 4) {
                System.out.println("Vous avez choisis l'opération Ouverture de Compte");
                OuvertureCompte ouvertureCompte = new OuvertureCompte();
                ouvertureCompte.ouvertureCompte();
            }

            if (operation == 5) {
                System.out.println("Vous avez choisis l'opération Fermeture de Compte");
                FermetureCompte fermetureCompte = new FermetureCompte();
                fermetureCompte.fermetureCompte();
            }

            if (operation == 6) {
                System.out.println("Vous avez choisis l'opération Ajout de Client");
                AjoutClients ajoutClients = new AjoutClients();
                ajoutClients.ajoutClients();
            }

            if (operation == 7) {
                System.out.println("Vous avez choisis l'opération Suppression de Client");
                SuppressionClients suppressionClients = new SuppressionClients();
                suppressionClients.suppressionClients();
            }

            if (operation == 8) {
                System.out.println("Vous avez choisis l'opération Modification de Client");
                ModificationClients modificationClients = new ModificationClients();
                modificationClients.modificationClients();
            }

            if (operation == 9){
                System.out.println("Vous avez choisis l'opération Ajout d'agence");
                AjoutAgence ajoutAgence = new AjoutAgence();
                ajoutAgence.ajoutAgence();
            }

            if (operation == 10){
                System.out.println("Vous avez choisis l'opération Suppression d'agence");
                SuppressionAgence suppressionAgence = new SuppressionAgence();
                suppressionAgence.suppressionAgence();
            }

            if (operation == 11){
                System.out.println("Vous avez choisis l'opération Modification d'agence");
                ModificationAgence modificationAgence = new ModificationAgence();
                modificationAgence.modificationAgence();
            }

            if (operation == 12){
                System.out.println("Vous avez choisis l'opération Ajout de Conseiller");
                AjoutConseiller ajoutConseiller = new AjoutConseiller();
                ajoutConseiller.ajoutConseiller();
            }

            if (operation == 13){
                System.out.println("Vous avez choisis l'opération Suppression de Conseiller");
                SuppressionConseiller suppressionConseiller = new SuppressionConseiller();
                suppressionConseiller.suppressionConseiller();
            }

            if (operation == 14){
                System.out.println("Vous avez choisis l'opération Modification de Conseiller");
                ModificationConseiller modificationConseiller = new ModificationConseiller();
                modificationConseiller.modificationConseiller();
            }

            if (operation == 15) {
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }
            i++;
        }
    }
}
