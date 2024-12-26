package challenge5;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[7];


        System.out.println("Entrez 7 nombres :");
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }


        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < 7; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Le plus grand nombre est : " + max);
        System.out.println("Le plus petit nombre est : " + min);
    }
}
