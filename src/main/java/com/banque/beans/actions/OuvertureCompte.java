package com.banque.beans.actions;

import java.util.Scanner;

public class OuvertureCompte {

    public void ouvertureCompte(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le numero de compte :");
        int numeroCompte = Integer.parseInt(scanner.next());
        System.out.println("Le compte entrer est : " + numeroCompte + " ;" );
        System.out.println("Entrez le solde du compte :");
        Scanner scanner2 = new Scanner(System.in);
        int soldeCompte = Integer.parseInt(scanner.next());
        System.out.println("Le solde du compte est : " + soldeCompte + " €;" );
    }
}
