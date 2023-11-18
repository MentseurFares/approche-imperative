package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tab = {};
        boolean firstLast = false;
        firstLast = tab.length != 0 && (tab[0] == tab[tab.length - 1]);
        System.out.println("le tableau contient le premir element et le dernier égaux : " + firstLast);

    }
}
