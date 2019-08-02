package programowanie2.kryptografia;

public class CezarCode {

    public String encode(String str){        //metoda szyfrujaca;
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++){
            int kod_ascii = (int) x[i];
            int n = x[i];
            //x[i] = (char) (((x[i] - 94) % 27) + 97);
            n += 5;
            x[i] = (char)n;
        }
        return new String(x);
    }

    static String decode(String str){     //metoda deszyfrujaca;
        char x[] = str.toCharArray();

        for(int i=0; i != x.length; i++) {
            int n = x[i];
            n -= 5;
            x[i] = (char)n;
        }
        return new String(x);
    }

}
