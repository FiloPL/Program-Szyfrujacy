package programowanie2.kryptografia;

public class VigenerCode {

    public void start(String word) {
        String a = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int k = 5;

        System.out.println(encodeV(word, a, "TELFON"));
        System.out.println(decodeV(encodeV(word, a, "TELFON"), a, "TELFON"));
    }

    public static String encodeV(String word, String alfabet, String key) {
        int dlk = key.length();
        int keyleng[] = new int[dlk];
        for (int i = 0; i < dlk; i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (key.charAt(i) == alfabet.charAt(j))
                    keyleng[i] = j;

        String result = "";

        int k = 0;
        for (int i = 0; i < word.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (word.charAt(i) == alfabet.charAt(j)) {
                    result += alfabet.charAt((j + keyleng[k % dlk]) % alfabet.length());
                    k++;
                }
        return result;
    }

    public static String decodeV(String word, String alfabet, String key) {
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
