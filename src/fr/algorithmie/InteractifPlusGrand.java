package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    private static final int OCCURENCE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intUser;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= OCCURENCE; i++) {
            System.out.println("Donner un chiffre  : ");
            intUser = scanner.nextInt();
            if (intUser > maxValue) {
                maxValue = intUser;
            }
        }
        System.out.println("La valeur max donnée : " + maxValue);
    }
}
