package programowanie2.kryptografia;

public class VigenerCode {

    public VigenerCode()
    {
        String a="abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String t="Kryptoanaliza i kryptografia";
        //String t="NIEOBECNY SAM SOBIE SZKODZI";
        int k=3;
        System.out.println(encodeV(t,a,k));
        System.out.println(decodeV(encodeV(t,a,k),a,k));
        System.out.println(szyfrujV(t,a,"TELFON"));
        System.out.println(deszyfrujV(szyfrujV(t,a,"TELFON"),a,"TELFON"));

         // TODO sprawdzić poprawnosc działania tego ustrojstwa

    }
    public static String encodeV(String tekst, String alfabet, int klucz)
    {
        String wynik="";
        for(int i=0; i<tekst.length();i++)
            for(int j=0; j<alfabet.length(); j++)
                if(tekst.charAt(i)==alfabet.charAt(j))
                    wynik+=alfabet.charAt((j+klucz)%alfabet.length());

        return wynik;
    }
    public static String decodeV(String tekst, String alfabet, int klucz)
    {
        String wynik="";
        for(int i=0; i<tekst.length();i++)
            for(int j=0; j<alfabet.length(); j++)
                if(tekst.charAt(i)==alfabet.charAt(j))
                    wynik+=alfabet.charAt((j-klucz+alfabet.length())%alfabet.length());

        return wynik;
    }
    public static String szyfrujV(String tekst, String alfabet, String klucz)
    {
        int dlk = klucz.length();
        int klucze[] = new int[dlk];
        for(int i=0; i<dlk;i++)
            for(int j=0; j<alfabet.length(); j++)
                if(klucz.charAt(i)==alfabet.charAt(j))
                    klucze[i]=j;

        String wynik="";
        int k=0;
        for(int i=0; i<tekst.length();i++)
            for(int j=0; j<alfabet.length(); j++)
                if(tekst.charAt(i)==alfabet.charAt(j)){
                    wynik+=alfabet.charAt((j+klucze[k%dlk])%alfabet.length());
                    k++;
                }
        return wynik;
    }
    public static String deszyfrujV(String tekst, String alfabet, String klucz)
    {
        int dlk = klucz.length();
        int klucze[] = new int[dlk];
        for(int i=0; i<dlk;i++)
            for(int j=0; j<alfabet.length(); j++)
                if(klucz.charAt(i)==alfabet.charAt(j))
                    klucze[i]=j;

        String wynik="";
        int k=0;
        for(int i=0; i<tekst.length();i++)
            for(int j=0; j<alfabet.length(); j++)
                if(tekst.charAt(i)==alfabet.charAt(j)){
                    wynik+=alfabet.charAt((j-klucze[k%dlk]+alfabet.length())%alfabet.length());
                    k++;
                }
        return wynik;
    }
}
