package challenge3;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Entrez 8 nombres entiers :");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Entrez le nombre à rechercher :");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("Le nombre " + searchNumber + " a été trouvé à la position " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Le nombre " + searchNumber + " n'a pas été trouvé dans le tableau.");
        }
    }
}