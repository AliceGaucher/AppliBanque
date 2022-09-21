package com.banque.beans.actions;

import java.util.Scanner;

public class AjoutConseiller {
    public void ajoutConseiller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le prenom du conseiller :");
        String prenomConseiller = scanner.next();
        System.out.println("Le conseiller s'appelle : " + prenomConseiller + " ;" );

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez le nom du conseiller :");
        String nomConseiller = scanner2.next();
        System.out.println("Le nom du conseiller est : " + nomConseiller + " ;" );

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Entrez le nom du conseiller :");
        int numero = Integer.parseInt(scanner3.next());
        System.out.println("Le numéro du conseiller est : " + numero + " ;" );

        System.out.println("Le conseiller créer est : " + prenomConseiller + " " + nomConseiller + " " + numero);

    }
}
