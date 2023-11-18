package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // affichage des elements de array superieur à 3
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3)
                System.out.print(array[i] + "\t");
        }
        System.out.println();

        // affichage des elements pairs de array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + "\t");
        }
        System.out.println();

        // affichage des elements de array avec index pairs
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                System.out.print(array[i] + "\t");
        }
        System.out.println();

        // affichage des elements impairs de array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1)
                System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

}
