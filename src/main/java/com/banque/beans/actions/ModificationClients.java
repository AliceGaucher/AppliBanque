package com.banque.beans.actions;

import java.util.Scanner;

public class ModificationClients {
    public void modificationClients() {
        int i = 0;
        while (i < 99) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez choisir une modification à effectuer : 1(Nom du Client) - 2(Prénom du Client) - 3(numéro de compte du Client) - 4(Quitter)");
            int choix = Integer.parseInt(scanner.next());

            if (choix == 1){
                System.out.println("Vous avez choisis de modifier le nom du client");
                System.out.println("Entrer le nom du client à modifier");
                Scanner scanner2 = new Scanner(System.in);
                String nom = scanner2.next();
                System.out.println("Le nom du client à modifier est : " + nom);
                System.out.println("Entrer le nouveau nom du client : ");
                Scanner scanner3 = new Scanner(System.in);
                String nom2 = scanner3.next();
                System.out.println("Le nom du client : " + nom + " a changé pour " + nom2);
            }

            if (choix == 2){
                System.out.println("Vous avez choisis de modifier le prenom du client");
                System.out.println("Entrer le prénom du client à modifier");
                Scanner scanner4 = new Scanner(System.in);
                String prenom = scanner4.next();
                System.out.println("Le prénom du client à modifier est : " + prenom);
                System.out.println("Entrer le nouveau nom du client : ");
                Scanner scanner5 = new Scanner(System.in);
                String prenom2 = scanner5.next();
                System.out.println("Le prénom du client : " + prenom + " a changé pour " + prenom2);
            }

            if (choix == 3){
                System.out.println("Vous avez choisis de modifier le numéro de compte du client");
                System.out.println("Entrer le numéro de compte du client à modifier");
                Scanner scanner6 = new Scanner(System.in);
                String numero = scanner6.next();
                System.out.println("Le numéro de compte à modifier est : " + numero);
                System.out.println("Entrer le nouveau numéro de compte du client : ");
                Scanner scanner7 = new Scanner(System.in);
                String numero2 = scanner7.next();
                System.out.println("Le numéro de compte du client : " + numero + " a changé pour " + numero2);
            }

            if (choix == 4){
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }
        }
    }
}
