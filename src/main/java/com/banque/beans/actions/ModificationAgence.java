package com.banque.beans.actions;

import java.util.Scanner;

public class ModificationAgence {
    public void modificationAgence() {
        int i = 0;
        while (i < 99) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez choisir une modification à effectuer : 1(Nom de l'agence) - 2(Numéro de l'adresse de l'agence) - 3(Adresse de l'agence) - 4(Quitter)");
            int choix = Integer.parseInt(scanner.next());

            if (choix == 1) {
                System.out.println("Vous avez choisis de modifier le nom de l'agence");
                System.out.println("Entrer le nom de l'agence à modifier");
                Scanner scanner2 = new Scanner(System.in);
                String nom = scanner2.next();
                System.out.println("Le nom de l'agence à modifier est : " + nom);
                System.out.println("Entrer le nouveau nom de l'agence : ");
                Scanner scanner3 = new Scanner(System.in);
                String nom2 = scanner3.next();
                System.out.println("Le nom de l'agence : " + nom + " a changé pour " + nom2);
            }

            if (choix == 2) {
                System.out.println("Vous avez choisis de modifier le numéro de l'adresse de l'agence");
                System.out.println("Entrer le nouveau numéro de l'adresse de l'agence à modifier");
                Scanner scanner2 = new Scanner(System.in);
                int numero = Integer.parseInt(scanner2.next());
                System.out.println("Le numéro de l'adresse de l'agence à modifier est : " + numero);
                System.out.println("Entrer le numéro de l'adresse de l'agence : ");
                Scanner scanner3 = new Scanner(System.in);
                int numero2 = Integer.parseInt(scanner3.next());
                System.out.println("Le numéro de l'adresse de l'agence : " + numero + " a changé pour " + numero2);
            }

            if (choix == 3) {
                System.out.println("Vous avez choisis de modifier l'adresse de l'agence");
                System.out.println("Entrer l'adresse de l'agence à modifier");
                Scanner scanner2 = new Scanner(System.in);
                String nom = scanner2.nextLine();
                System.out.println("L'adresse de l'agence à modifier est : " + nom);
                System.out.println("Entrer la nouvelle adresse de l'agence : ");
                Scanner scanner3 = new Scanner(System.in);
                String nom2 = scanner3.nextLine();
                System.out.println("L'adresse de l'agence : " + nom + " a changée pour " + nom2);
            }

            if (choix == 4) {
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }
            i++;
        }
    }
}