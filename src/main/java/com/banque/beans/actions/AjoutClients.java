package com.banque.beans.actions;

import java.util.Scanner;

public class AjoutClients {
    public void ajoutClients(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le prenom du client :");
        String prenomCompte = scanner.next();
        System.out.println("Le client s'appelle : " + prenomCompte + " ;" );

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez le nom du client :");
        String nomCompte = scanner2.next();
        System.out.println("Le nom du client est : " + nomCompte + " ;" );
        System.out.println("Le client créer est : " + prenomCompte + " " + nomCompte);

    }
}
