package programowanie2.kryptografia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaronCode {
    public void start(String word) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(encodeBaron(word, alfabet));
        System.out.println((decodeBaron(word, alfabet)));
    }

    private String decodeBaron(String word, String alfabet) {
        changeValue(word);
        return null;
    }

    private String encodeBaron(String word, String alfabet) {
        changeValue(word);
        return null;
    }

    private String changeValue(String word) {
        List<String> resultList = new ArrayList<>();
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('A', "aaaaa");
        map.put('B', "aaaab");
        map.put('C', "aaaba");
        map.put('D', "aaabb");
        map.put('E', "aabaa");
        map.put('F', "aabab");
        map.put('G', "aabba");
        map.put('H', "aabbb");
        map.put('I', "abaaa");
        map.put('J', "abaaa");
        map.put('K', "abaab");
        map.put('L', "ababa");
        map.put('M', "ababb");
        map.put('N', "abbaa");
        map.put('O', "abbab");
        map.put('P', "abbba");
        map.put('Q', "abbbb");
        map.put('R', "baaaa");
        map.put('S', "baaab");
        map.put('T', "baaba");
        map.put('U', "baabb");
        map.put('V', "baabb");
        map.put('W', "babaa");
        map.put('X', "babab");
        map.put('Y', "babba");
        map.put('Z', "babbb");
//
//        for (int i = 0; i < idNumbers.size(); i++) {
//            String idNumber = idNumbers.get(i);
//            int[] resultTemp = new int[9];
//            if (idNumber.length() == 9) {
//                for (int j = 0; j < idNumber.length(); j++) {
//                    char character = idNumber.charAt(j);
//                    if (j < 3) {
//                        resultTemp[j] = map.get(character);
//                    } else {
//                        resultTemp[j] = Character.getNumericValue(character);
//                    }
//                }
//                int result = resultTemp[0] * 7 + resultTemp[1] * 3 + resultTemp[2] * 1 + resultTemp[3] * 9 + resultTemp[4] * 7 +
//                        resultTemp[5] * 3 + resultTemp[6] * 1 + resultTemp[7] * 7 + resultTemp[8] * 3;
//                //wagi, reszta z dzielenia sumy iloczynów przez 10 powiinna ==0
//                if (result % 10 == 0) {
//                    resultList.add(idNumber);
//                }
//            }
//        }

        return null;
    }

}

