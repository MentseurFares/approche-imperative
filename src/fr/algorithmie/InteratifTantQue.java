package fr.algorithmie;

import java.util.Scanner;

public class InteratifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jeu interactif \nAppuyer ENTREE pour commencer ...");
        scanner.nextLine();
        int intUser;
        do {
            System.out.println("donner un entier entre 1 et 10");
            intUser = scanner.nextInt();
        } while (intUser < 1 || intUser > 10);
        System.out.println("Entier : " + intUser + " valide \nFin du jeu.");
    }
}
