package programowanie2.kryptografia;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Tomasz Filo Zegarlicki
 * [https://github.com/FiloPL]
 * @date : 13.08.2019 19:18
 */
public class Menu {
    public int choiceMenu() {
        System.out.println("Do you want:");
        System.out.println("1. Code onw tezt");
        System.out.println("2. Code system tezt");
        System.out.println();

        int nr = 312;
        // wpisana wartosc poczatkowa jest wieksza od wyboru. Gdy wystąpi wyjatek w przypadku zera nie
        // zostało by zapętlone wpisywanie poprawnej liczby z menu
        do {
            System.out.println("Please write you choice: ");
            try {
                Scanner number = new Scanner(System.in);
                nr = number.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please write corrent number");
            }

        } while (nr > 2);

        return nr;
    }
}
