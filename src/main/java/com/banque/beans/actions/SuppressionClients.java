package com.banque.beans.actions;

import java.util.Scanner;

public class SuppressionClients {
    public void suppressionClients() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le prenom du client à supprimer :");
        String prenomCompte = scanner.next();
        System.out.println("Le client à supprimer s'appelle : " + prenomCompte + " ;" );

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Entrez le nom du client à supprimer:");
        String nomCompte = scanner2.next();
        System.out.println("Le nom du client à supprimer est : " + nomCompte + " ;" );
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Entrez le numero de compte du client à supprimer:");
        int numeroCompte = Integer.parseInt(scanner3.next());
        System.out.println("Le client supprimer est : " + prenomCompte + " " + nomCompte + " " +numeroCompte);

    }
}
