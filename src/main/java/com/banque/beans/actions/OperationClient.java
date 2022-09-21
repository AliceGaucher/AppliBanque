package com.banque.beans.actions;

import com.banque.beans.Clients;

import java.util.Scanner;


public class OperationClient {
    public void OperationClient() {
        int i = 0;
        while (i < 99) {
            System.out.println("Vous avez choisis d'être un Client");
            Clients client = new Clients("Bob", "Moranne", "Homme", 40, true, true, true, true);
            System.out.println("Bonjour " + client.prenom+ " " + client.nom);

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Veuillez choisir un type d'opération : 1(Retrait) - 2(Versement) - 3(Affichage des comptes) - 4(Quitter)");
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
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }
            i++;
        }
    }
}
