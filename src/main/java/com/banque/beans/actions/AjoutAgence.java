package com.banque.beans.actions;

import java.util.Scanner;

public class AjoutAgence {
    public void ajoutAgence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'agence :");
        String nomAgence = scanner.next();
        System.out.println("L'agence s'appelle : " + nomAgence + " ;" );

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez le numéro de l'adresse de l'agence :");
        int numeroAgence = Integer.parseInt(scanner1.next());

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez l'adresse de l'agence :");
        int adresseAgence = Integer.parseInt(scanner2.next());
        System.out.println("L'adresse de l'agence est : " + numeroAgence + " " + adresseAgence + " ;" );

        System.out.println("L'agence " + nomAgence + " est maintenant à l'adresse : " + numeroAgence + " " + adresseAgence);

    }
}
