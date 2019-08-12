package programowanie2.kryptografia;

import java.util.Random;
import java.util.Scanner;

public class TextOfUser {

    public String ImportTextOfUser() {
        System.out.println("Please write below text to code:");
        Scanner scan = new Scanner(System.in);
        String textToCode = scan.nextLine();
        return textToCode;
    }

    public String DefaultTextToCode() {
        String text = RandomText();
        return text;
    }

    private String RandomText() {
        String[] listOfText = {"Ala have a cat and she want one more!",
                "To, że milcze, nie znaczy, że nie mam nic do powiedzenia",
                "Kocha sie za nic. Nie istnieje zaden powod do milosci",
                "Smierc jest latwa, prosta, zycie jest trudniejsze",
                "Ludzie buduja za duzo murow, a za malo mostow",
                "Rob, co mozesz, w miejscu, jakim jestes i z tym, co masz",
                "Dopiero w samotnosci człowiek jest naprawdę soba",
                "Byc szczesliwym - tego trzeba się nauczyc",
                "Człowiek naprawdę posiada tylko to, co jest w nim",
                "Badz dobrej mysli, bo po co byc zlej"};
        return listOfText[RandomTextGetNumber(listOfText)];
    }

    private int RandomTextGetNumber(String[] listOfText) {
        Random random = new Random();
        int result = random.nextInt(listOfText.length);
        return result;
    }
}
