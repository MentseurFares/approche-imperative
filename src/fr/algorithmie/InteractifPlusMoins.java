package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("J'ai choisi un chiffre entre 1 et 100\nEssayer de deviner : ");
        int myValue = 1 + (int) (100 * Math.random());
        int nbTentative = 0;
        int intUser;
        int borneInferieur = 1; // pour aider l'utlisateur avec la borne inferieur
        int borneSuperieur = 100; // pour aider l'utilisateur avec la borne superieur

        do {
            System.out.println("un chiffre entre " + borneInferieur + " et " + borneSuperieur + " : ");
            intUser = scanner.nextInt();
            if (intUser == myValue) {
                break;
            } else if (intUser > myValue) {
                System.err.println(intUser + " est plus grand");
                if (intUser < borneSuperieur) {
                    borneSuperieur = intUser;
                }
            } else {
                System.err.println(intUser + " est plus petit");
                if (intUser > borneInferieur) {
                    borneInferieur = intUser;
                }
            }
            nbTentative++;
        } while (intUser != myValue);

        System.out.println("Bravo, vous avez trouvé en : " + nbTentative + " tentitves");
    }


}
