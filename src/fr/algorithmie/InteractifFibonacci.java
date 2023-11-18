package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduire un nombre entier : ");
        int intUser = scanner.nextInt();
        int result = fibonacci(intUser);
        System.out.println("Le nombre de rang " + intUser + " de la suite de Fibonacci = " + result);
    }
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
