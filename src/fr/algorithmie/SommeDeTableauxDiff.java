package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int tab3Size = (tab1.length > tab2.length) ? tab1.length : tab2.length;
        int[] tab3 = new int[tab3Size];

        for (int i = 0; i < tab3.length; i++) {
            if (i < tab1.length) {
                tab3[i] += tab1[i];
            }
            if (i < tab2.length) {
                tab3[i] += tab2[i];
            }
        }

        FonctionsUtiles.affichageTableau(tab1);
        FonctionsUtiles.affichageTableau(tab2);
        FonctionsUtiles.affichageTableau(tab3);
    }

}
