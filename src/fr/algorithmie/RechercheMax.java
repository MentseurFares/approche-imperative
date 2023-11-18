package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        // recherche du max d'un tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int maxArray = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        System.out.println("le Max du tableau array : " + maxArray);
    }
}
