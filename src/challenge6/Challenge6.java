package challenge6;

import java.util.Scanner;

public class Challenge6 {

    public static void afficherCarres(int[] numbers) {
        for (int number : numbers) {
            System.out.println("Le carré de " + number + " est " + (number * number));
        }
    }


    public static int carre(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];


        System.out.println("Entrez 5 nombres :");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }


        System.out.println("Les carrés des nombres sont :");
        afficherCarres(numbers);

        System.out.println("Entrez un nombre pour calculer son carré :");
        int num = scanner.nextInt();
        int square = carre(num);
        System.out.println("Le carré de " + num + " est " + square);
    }
}
