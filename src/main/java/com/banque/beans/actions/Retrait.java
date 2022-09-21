package com.banque.beans.actions;

import java.util.Scanner;

public class Retrait {
    public void retrait() {
        int i = 0;
        while(i <= 99) {

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Veuillez choisir un compte 1(Compte courant) - 2(Compte épargne) - 3(Compte Rémunéré) - 4(Quitter): ");
            int value2 = Integer.parseInt(scanner2.next());
            String value3 = "";

            if (value2 == 1){
                System.out.println("Vous avez choisi le Compte courant");
                value3 = "Compte courant";
            }

            if (value2 == 2){
                System.out.println("Vous avez choisi le Compte épargne");
                value3 = "Compte épargne";
            }

            if (value2 == 3){
                System.out.println("Vous avez choisi le Compte Rémunéré");
                value3 = "Compte Rémunéré";
            }

            if (value2 == 4){
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez entrer une somme à retirer: ");
            int value = Integer.parseInt(scanner.next());

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Veuillez entrer la somme que vous avez sur le compte: ");
            int value4 = Integer.parseInt(scanner4.next());

            if (value > 0) {
                int resultat = value4 - value;
                if (value4 < value) {
                    System.out.println("Vous n'avez pas assez sur votre Compte, veuillez entrer une somme valide");
                }
                System.out.println("Vous avez sur le "+ value3 +" la somme de " + value4 + "€" + " et vous avez retirer " + value + "€" + " il vous reste " + resultat + "€");
            }

            i++;
        }
    }
}
