package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        //BOUCLE FOR affichage des nombres entre 1 et 10 inclus
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //BOUCLE FOR affichage des nombres pairs entre 0 et 10 inclus
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();

        //BOUCLE FOR affichage des nombres impairs entre 0 et 10 inclus
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();

        //BOUCLE WHILE affichage des nombres entre 1 et 10 inclus
        int i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            i++;
        }
        System.out.println();
        //BOUCLE FOR affichage des nombres pairs entre 0 et 10 inclus
        i = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
            i++;
        }
        System.out.println();

        //BOUCLE FOR affichage des nombres impairs entre 0 et 10 inclus
        i = 0;
        while (i <= 10) {
            if (i % 2 == 1) {
                System.out.print(i + "\t");
            }
            i++;
        }
        System.out.println();
    }
}
