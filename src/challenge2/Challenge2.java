package challenge2;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0.0;

        System.out.println("Entrez 10 nombres décimaux :");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / 10;
        System.out.println("Somme : " + sum);
        System.out.println("Moyenne : " + average);
    }
}