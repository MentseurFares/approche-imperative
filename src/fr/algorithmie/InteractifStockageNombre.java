package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

    public static void main(String[] args) {
        int[] array = new int[10]; // tableau initialisé avec 10 éléments;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int indexTableau = 0;
        int choix = 0;
        do {
            System.out.println("1. Ajouter un nombre ");
            System.out.println("2. Afficher les nombres existants");
            choix = scanner.nextInt();
            if (choix == 1) {
                System.out.println("Donner un entier : ");
                if (indexTableau >= array.length) {
                    array = increaseTabSize(array);
                }
                array[indexTableau] = scanner.nextInt();
                indexTableau++;
            }
            if (choix == 2) {
                for (int i = 0; i < indexTableau; i++) {
                    System.out.print(array[i] + "\t");
                }
                System.out.println();
                exit = true;
            }
        } while (!exit);

    }


    public static int[] increaseTabSize(int[] tab) {
        int[] newArr = new int[tab.length + 1]; // Creating a new array with space for an extra element
        for (int i = 0; i < tab.length; i++) {
            newArr[i] = tab[i]; // Copying the elements to the new array
        }
        return newArr;
    }
}
