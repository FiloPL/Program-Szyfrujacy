package programowanie2.kryptografia;

/**
 * @author Tomasz Filo Zegarlicki
 * [https://github.com/FiloPL]
 * @date : 13.08.2019 19:37
 */

public interface ICode  {
    /**
     * Ta metoda uruchamia wykonanie danej metody szyforwania
     * przyjmuje jako argument slowo do szyfrowania
     * @param word
     * @return word
     * zwraca słowo zaszfrowane
     */
    void Start(String word);

}
