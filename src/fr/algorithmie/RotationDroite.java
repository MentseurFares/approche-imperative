package fr.algorithmie;

public class RotationDroite {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int transit = 0;
        FonctionsUtiles.affichageTableau(array);
        if (array.length != 0) {
            transit = array[array.length - 1];
        }
        for (int i = array.length - 1; i > 1; i--) {
            array[i] = array[i - 1];
        }
        if (array.length != 0) {
            array[0] = transit;
        }
        FonctionsUtiles.affichageTableau(array);
    }
}
