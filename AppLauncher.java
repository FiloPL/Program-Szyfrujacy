package programowanie2.kryptografia;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppLauncher implements IAppLauncher {
    @Override
    public void start() {

        TextOfUser userText = new TextOfUser();

        do {
            int userDecisionOfText = choiceMenu();
            System.out.println("In program");
            String textToCode;
            switch (userDecisionOfText) {
                case 1:
                    textToCode = userText.ImportTextOfUser();
                    break;
                case 2:
                    textToCode = userText.DefaultTextToCode();
                    break;
                default:
                    System.out.println("Error 404 = Something go wrong");
                    break;
            }
            Encryption enrypt = new Encryption();
            int wayOfCode = enrypt.MetodToCode();

            switch (wayOfCode) {
                case 1:
                    System.out.println("You choosen - Cezar Code");
                    break;
                case 2:
                    System.out.println("You choosen - Vigner`a Code");
                    break;
                case 3:
                    System.out.println("You choosen - Baron Code");
                    break;
                default:
                    System.out.println("Something goes wrong");
                    break;
            }
        } while (exit());
    }

    public boolean exit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want use App one more time?");
        boolean oneMore;
        boolean exit = false;
        do {
            System.out.println("Write true or false");
            String option = scanner.nextLine();
            option = option.toLowerCase().trim();
            if (option.equals("true") || option.equals("false")) {
                oneMore = false;
                if (option.equals("true")) {
                    exit = true;
                } else {
                    exit = false;
                }

            } else {
                oneMore = true;
            }
        } while (oneMore);
        return exit;
    }

    public int choiceMenu() {
        System.out.println("Do you want:");
        System.out.println("1. Code onw tezt");
        System.out.println("2. Code system tezt");
        System.out.println();

        int nr = 8;
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
