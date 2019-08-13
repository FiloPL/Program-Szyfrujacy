
package programowanie2.kryptografia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppLauncher implements IAppLauncher {
    @Override
    public void start() {

        TextOfUser userText = new TextOfUser();

        do {
            Menu menuTxt = new Menu();
            int userDecisionOfText = menuTxt.choiceMenu();
            //System.out.println("In program");
            String textToCode = " ";
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

            ChooseCode chooseMetodToCode = new ChooseCode();
            int wayOfCode = chooseMetodToCode.MetodToCode();

            switch (wayOfCode) {
                case 1:
                    System.out.println("You choosen - Cezar Code");
                    CezarCode cezarCode = new CezarCode();
                    cezarCode.Start(textToCode);
                    break;
                case 2:
                    System.out.println("You choosen - Vigner`a Code");
                    VigenerCode vigenerCode = new VigenerCode();
                    vigenerCode.Start(textToCode);
                    break;
                case 3:
                    System.out.println("You choosen - Baron Code");
                    BaronCode baron = new BaronCode();
                    baron.Start(textToCode);
                    break;
                default:
                    System.out.println("Something goes wrong");
                    break;
            }
        } while (exitCondition());
    }

    private boolean exitCondition() {
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

}
