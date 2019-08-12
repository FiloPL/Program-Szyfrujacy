package programowanie2.kryptografia;

public class VigenerCode {

    public void start(String word) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String keyWord = "TELEFON";

        System.out.println(encodeV(word, alfabet, keyWord));
        System.out.println(decodeV(encodeV(word, alfabet, keyWord), alfabet, keyWord));
    }

    private static String encodeV(String word, String alfabet, String key) {
        int dlk = key.length();
        int keyLength[] = new int[dlk];
        for (int i = 0; i < dlk; i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (key.charAt(i) == alfabet.charAt(j))
                    keyLength[i] = j;

        String result = "";

        int k = 0;
        for (int i = 0; i < word.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (word.charAt(i) == alfabet.charAt(j)) {
                    result += alfabet.charAt((j + keyLength[k % dlk]) % alfabet.length());
                    k++;
                }
        return result;
    }

    private static String decodeV(String word, String alfabet, String key) {
        int dlk = key.length();
        int klucze[] = new int[dlk];
        for (int i = 0; i < dlk; i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (key.charAt(i) == alfabet.charAt(j))
                    klucze[i] = j;

        String result = "";
        int k = 0;

        for (int i = 0; i < word.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (word.charAt(i) == alfabet.charAt(j)) {
                    result += alfabet.charAt((j - klucze[k % dlk] + alfabet.length()) % alfabet.length());
                    k++;
                }
        return result;
    }
}
