package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tab = {6, 1, 4, 6, 7, 6};
        boolean firstLast6 = false;
        firstLast6 = tab.length != 0 && (tab[0] == 6 || tab[tab.length - 1] == 6);
        System.out.println("le tableau contient le premir element ou le dernier egale à 6 : " + firstLast6);

    }
}
