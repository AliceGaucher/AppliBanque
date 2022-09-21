package com.banque.beans.actions;

import java.util.Scanner;

public class SuppressionAgence {
    public void suppressionAgence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'agence à supprimer :");
        String nomAgence = scanner.next();
        System.out.println("L'agence à supprimer s'appelle : " + nomAgence + " ;" );

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez le numéro de l'adresse de l'agence à supprimer :");
        int numeroAgence = Integer.parseInt(scanner1.next());
        System.out.println("Le numéro de l'adresse de l'agence à supprimer est : " + numeroAgence + " ;" );

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez l'adresse de l'agence à supprimer :");
        String adresseAgence = scanner2.nextLine();
        System.out.println("L'adresse de l'agence à supprimer est : " + numeroAgence + " ;" );

        System.out.println("L'agence supprimer est : " + nomAgence + " " + numeroAgence + " " + adresseAgence);
    }
}
