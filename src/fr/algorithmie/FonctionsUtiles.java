package fr.algorithmie;

public class FonctionsUtiles {
    // une petite fonction qui permet un affichage horizontale d'un tableau qui simplifie la visualisation du résultat
    public static void affichageTableau(int[] tab) {
        // affichage array
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
    }
}
