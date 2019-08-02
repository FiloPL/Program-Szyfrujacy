package programowanie2.kryptografia;

import java.util.Scanner;

public class TextOfUser {

    public String ImportTextOfUser() {
        System.out.println("Please write below text to code:");
        Scanner scan = new Scanner(System.in);
        String textToCode = scan.nextLine();
        return textToCode;
    }

    public String DefaultTextToCode() {
        String text = "Ala have a cat and she want one more!";
        return text;
    }

}
