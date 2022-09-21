package com.banque.beans.actions;

import java.util.Scanner;

public class ModificationConseiller {
    public void modificationConseiller() {
        int i = 0;
        while (i < 99) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez choisir une modification à effectuer : 1(Nom du conseiller) - 2(Numéro du conseiller) - 3(Prénom du conseiller) - 4(Quitter)");
            int choix = Integer.parseInt(scanner.next());

            if (choix == 1) {
                System.out.println("Vous avez choisis de modifier le nom du conseiller");
                System.out.println("Entrer le nom du conseiller à modifier");
                Scanner scanner2 = new Scanner(System.in);
                String nom = scanner2.next();
                System.out.println("Le nom du conseiller à modifier est : " + nom);
                System.out.println("Entrer le nouveau nom du conseiller : ");
                Scanner scanner3 = new Scanner(System.in);
                String nom2 = scanner3.next();
                System.out.println("Le nom du conseiller : " + nom + " a changé pour " + nom2);
            }

            if (choix == 2) {
                System.out.println("Vous avez choisis de modifier le numéro du conseiller");
                System.out.println("Entrer le nouveau numéro du conseiller à modifier");
                Scanner scanner2 = new Scanner(System.in);
                int numero = Integer.parseInt(scanner2.next());
                System.out.println("Le numéro de l'adresse du conseiller à modifier est : " + numero);
                System.out.println("Entrer le numéro du conseiller : ");
                Scanner scanner3 = new Scanner(System.in);
                int numero2 = Integer.parseInt(scanner3.next());
                System.out.println("Le numéro du conseiller de l'agence : " + numero + " a changé pour " + numero2);
            }

            if (choix == 3) {
                System.out.println("Vous avez choisis de modifier le prénom du conseiller");
                System.out.println("Entrer le prénom du conseiller à modifier");
                Scanner scanner2 = new Scanner(System.in);
                String nom = scanner2.nextLine();
                System.out.println("Le prénom du conseiller à modifier est : " + nom);
                System.out.println("Entrer le prénom du conseiller de l'agence : ");
                Scanner scanner3 = new Scanner(System.in);
                String nom2 = scanner3.nextLine();
                System.out.println("Le prénom du conseiller : " + nom + " a changée pour " + nom2);
            }

            if (choix == 4) {
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }
            i++;
        }
    }
}
