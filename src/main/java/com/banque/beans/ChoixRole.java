package com.banque.beans;

import com.banque.beans.actions.*;

import java.util.Scanner;

public class ChoixRole {
    public void choixRole() {
        int i = 0;
        while (i < 99) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez choisir un rôle : 1(Client) - 2(Conseiller) - 3(Directeur) - 4(Quitter)");
            int role = Integer.parseInt(scanner.next());

            if (role == 1) {
                OperationClient operationClient = new OperationClient();
                operationClient.OperationClient();
            }

            if (role == 2) {
                OperationConseiller operationConseiller = new OperationConseiller();
                operationConseiller.operationConseiller();
            }

            if (role == 3) {
                OperationDirecteur operationDirecteur = new OperationDirecteur();
                operationDirecteur.operationDirecteur();
            }

            if (role == 4){
                System.out.println("Vous avez quitter, bonne journée");
                break;
            }
        }
    }
}