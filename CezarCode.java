package programowanie2.kryptografia;

public class CezarCode {

    public void start(String word) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int howMuchToMove = 5;

        System.out.println(encodeCezar(word, alfabet, howMuchToMove));
        System.out.println(decodeCezar(encodeCezar(word, alfabet, howMuchToMove), alfabet, howMuchToMove));
        // TODO sprawdzić pfafadoprawnosc działania tego ustrojstwa

    }

    public static String encodeCezar(String word, String alfabet, int key) {
        String result = "";
        for (int i = 0; i < word.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (word.charAt(i) == alfabet.charAt(j))
                    result += alfabet.charAt((j + key) % alfabet.length());

        return result;
    }

    public static String decodeCezar(String word, String alfabet, int key) {
        String result = "";
        for (int i = 0; i < word.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (word.charAt(i) == alfabet.charAt(j))
                    result += alfabet.charAt((j - key + alfabet.length()) % alfabet.length());

        return result;
    }


}
