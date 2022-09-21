package com.banque.beans.actions;

import java.util.Scanner;

public class SuppressionConseiller {
    public void suppressionConseiller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom du conseiller à supprimer :");
        String nomConseiller = scanner.next();
        System.out.println("Le conseiller à supprimer s'appelle : " + nomConseiller + " ;");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez le prénom du conseiller à supprimer :");
        String prenomConseiller = scanner1.next();
        System.out.println("Le prénom du conseiller à supprimer est : " + prenomConseiller + " ;");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez le numéro du conseiller à supprimer :");
        int numeroConseiller = Integer.parseInt(scanner2.nextLine());
        System.out.println("Le numéro du conseiller à supprimer est : " + numeroConseiller + " ;");

        System.out.println("Le conseiller supprimer est : " + nomConseiller + " " + prenomConseiller + " " + numeroConseiller);
    }
}
