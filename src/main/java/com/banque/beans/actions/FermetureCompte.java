package com.banque.beans.actions;

import java.util.Scanner;

public class FermetureCompte {
    public void fermetureCompte(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le numero de compte :");
        int numeroCompte = Integer.parseInt(scanner.next());
        System.out.println("Le compte supprimer est : " + numeroCompte + " ;" );
    }
}
