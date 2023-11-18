package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    // Afficher la table de mutliplication d'un chiffre entre 1 et 10 introduit par l'utilisateur
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jeu interactif \nAppuyer ENTREE pour commencer ...");
        scanner.nextLine();
        int intUser;
        do {
            System.out.println("Donner un entier entre 1 et 10 ");
            intUser = scanner.nextInt();
        } while (intUser < 1 || intUser > 10);
        System.out.println("Tabled e mutliplication de " + intUser);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + intUser + " = " + (i * intUser));
        }
    }
}
