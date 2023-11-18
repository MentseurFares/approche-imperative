package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    private static final int NB_BATONS = 21;
    private static final int NB_BATONS_MAX_PAR_JOUEUR = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nbBatonsRestants = NB_BATONS;
        Scanner scanner = new Scanner(System.in);
        int intUser;
        int intMachine;
        boolean isFinished = false;
        while (!isFinished) {
            intUser = choixUtilisateur(nbBatonsRestants);
            nbBatonsRestants -= intUser;
            if (nbBatonsRestants == 1) {
                isFinished = true;
                System.out.println("Vous avez gagné ! ");
            } else {
                intMachine = choixMachine(nbBatonsRestants);
                System.out.println("J'ai choisi de retirer : " + intMachine + " batons");
                nbBatonsRestants -= intMachine;
                if (nbBatonsRestants == 1) {
                    isFinished = true;
                    System.out.println("Vous avez perdu ! ");
                }
            }
        }
        ;
    }

    // fonction pour trouver le choix de la machine
    private static int choixUtilisateur(int nbBatonsRestants) {
        boolean goodChoice = false;
        int intUser;
        do {
            System.out.println("Nombre de batons restants : " + nbBatonsRestants);
            System.out.println("Choisir le nombre de batons à retirer ");
            intUser = scanner.nextInt();
            if (intUser < 1 || intUser > NB_BATONS_MAX_PAR_JOUEUR) {
                System.out.println("Votre choix doit être entre 1 et 3 ");
            } else if (nbBatonsRestants <= 4 && nbBatonsRestants - intUser < 1) {
                System.out.println("Penser à laisser le dernier batton pour votre adversaire !!!");
            } else {
                goodChoice = true;
            }
        } while (!goodChoice);
        return intUser;
    }

    // fonction pour récupérer le choix de l'utlisateur
    private static int choixMachine(int nbBatonsRestants) {
        if (nbBatonsRestants <= NB_BATONS_MAX_PAR_JOUEUR + 1) {
            System.out.println();
            return (nbBatonsRestants - 1);
        } else {
            return (int) ((Math.random() * 3) + 1);
        }
    }


}


