package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    private static final int OCCURENCE = 10;

    // Affichage des 10 entiers consécutif d'un entier
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un chiffre : ");
        int intUser = scanner.nextInt();
        System.out.println("les" + OCCURENCE + "chiffres qui suivent le chiffre " + intUser);
        for (int i = 1; i <= OCCURENCE; i++) {
            System.out.println(intUser + i);
        }
    }
}
