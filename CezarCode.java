package programowanie2.kryptografia;

public class CezarCode {

    public void start(String word) {
        String a ="abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int k = 5;

        System.out.println(encodeCezar(word,a,k));
        System.out.println(decodeCezar(encodeCezar(word,a,k),a,k));

        // TODO sprawdzić poprawnosc działania tego ustrojstwa

    }
    public static String encodeCezar(String tekst, String alfabet, int klucz)
    {
        String wynik="";
        for(int i=0; i<tekst.length();i++)
            for(int j=0; j<alfabet.length(); j++)
                if(tekst.charAt(i)==alfabet.charAt(j))
                    wynik+=alfabet.charAt((j+klucz)%alfabet.length());

        return wynik;
    }
    public static String decodeCezar(String tekst, String alfabet, int klucz)
    {
        String wynik = "";
        for(int i=0; i<tekst.length();i++)
            for(int j=0; j<alfabet.length(); j++)
                if(tekst.charAt(i) == alfabet.charAt(j))
                    wynik+=alfabet.charAt((j-klucz+alfabet.length())%alfabet.length());

        return wynik;
    }



}
