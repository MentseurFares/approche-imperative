package fr.algorithmie;


public class FabriquerMur {

    private static final int PETITE_BRIQUE = 1;
    private static final int GRANDE_BRIQUE = 5;

    public static void main(String[] args) {
// Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        int tailleBriques = 0;
        int i = 0;
        while (!resultat && i <= nbSmall) {
            int j = 0;
            while (!resultat && j <= nbBig) {
                tailleBriques = (i * PETITE_BRIQUE) + (j * GRANDE_BRIQUE);
                if (tailleBriques == longueur) {
                    resultat = true;
                } else if (tailleBriques > longueur) {
                    break;
                }
                j++;
            }
            i++;
        }
        return resultat;
    }

    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }
}