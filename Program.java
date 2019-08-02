package programowanie2.kryptografia;

/**
 * Program zajmujacy się szyfrowaniem
 * Uzytkownik wybiera to czy chce by zaszyfrowany był jego własny tekst
 * czy tekst przykładowy
 * nastętpnie wybiera sposób szyfrownaia
 * program może być wywołany wiele razy
 */
public class Program {
    public static void main(String[] args) {

        System.out.println("Cryptoigraphy - ver 1.01");
        try {
            IAppLauncher app = new AppLauncher();
            app.start();
        } catch (Exception error) {
            System.out.println("Application Error");
            error.getMessage();
            throw error;
        }

/*

        String exit = "Exit";
        do {
            TextOfUser textOfUser = new TextOfUser();
            CezarCode code = new CezarCode();
            int choice = textOfUser.choice();
            String textTocode;
            if(choice == 1)
            {
                textTocode = textOfUser.getText();
            } else {
                textTocode = "Alea iacta est - Julius Cezar";
            }
            System.out.println(textTocode);
            textTocode = code.encode(textTocode);
            System.out.println(textTocode);
            textTocode = code.decode(textTocode);
            System.out.println(textTocode);
            exit = exitMessage(exit);
        } while (!(exit.equalsIgnoreCase("exit")));
    }

    private static String exitMessage(String choice) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you what use APP one more time?");
        System.out.println("Write exit to close the APP");
        choice = scanner.nextLine();
        return choice;
    }
    */

    }
}

