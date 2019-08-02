package programowanie2.kryptografia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Encryption {

    public int MetodToCode() {
        System.out.println("What way to code do you want uuse you want:");
        System.out.println("1. Cezar Code");
        System.out.println("2. Vigener Code");
        System.out.println("3. Baron Code");

        int nr = 8;
        // wpisana wartosc poczatkowa jest wieksza od wyboru. Gdy wystąpi wyjatek w przypadku zera nie
        // zostało by zapętlone wpisywanie poprawnej liczby z menu
        do {
            System.out.println("Please write you choice: ");
            try {
                System.out.println();
                Scanner number = new Scanner(System.in);
                nr = number.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please write corrent number");
            }

        } while (nr > 4);

        return nr;
    }
}
