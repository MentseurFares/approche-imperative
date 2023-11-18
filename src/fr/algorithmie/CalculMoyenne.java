package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {

        // calculer la moyenne du tableau
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        if (array.length != 0) {
            System.out.println("la moyenne  du tableau : " + (double) sumArray / array.length);
        } else {
            System.err.println("Le tableau est vide ! ");
        }
    }
}
