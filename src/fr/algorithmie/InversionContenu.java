package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        // Copier le contenu inverse dans un nouveau tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[array.length - 1 - i] = array[i];
        }
        // affichage array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        // affichage arrayCopy

        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + "\t");
        }
        System.out.println();
    }
}
