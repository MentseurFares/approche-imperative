package fr.algorithmie;

public class AffichageInverse {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];
        // affichage des elements de tableau
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        // affichage des elements du tableau dans l'ordre inverse
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i - 1] + "\t");
        }
        System.out.println();

        // Copier le contenu d'un tableau dans un autre tableau
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }

    }


}
