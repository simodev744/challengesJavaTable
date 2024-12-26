package challenge1;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Entrez 5 nombres entiers :");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Les nombres dans l'ordre inverse :");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}