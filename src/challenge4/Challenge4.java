package challenge4;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        System.out.println("Entrer les chaînes :");
        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.next();
        }


        System.out.println("Entrez la chaîne à rechercher :");
        String searchString = scanner.next();


        boolean found = false;
        for (int i = 0; i < 3; i++) {
            if (strings[i].equals(searchString)) {
                System.out.println("La chaîne \"" + searchString + "\" a été trouvée à la position " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("La chaîne \"" + searchString + "\" n'a pas été trouvée.");
        }
    }
}
