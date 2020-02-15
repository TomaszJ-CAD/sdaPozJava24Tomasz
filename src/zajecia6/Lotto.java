package zajecia6;

/*1. Napisz program symulujący grę w Lotto:
        a. Użytkownik typuje 6 cyfr
        b. Program losuje 6 cyfr z liczb od 1 do 49
        c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
        d. Program wypisuje na ekranie wylosowane cyfry
        e. Program wyświetla wynik użytkownika w poniższej formie:
        i. Trafiono n z 6 cyfr
        f. *Upewnij się że użytkownik podaje 6 różnych liczb
        g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
        h. ! Skorzystaj z klasy java.util.Random*/


import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        int liczbaTypowana;
        int liczbaWylosowana;

        System.out.println("Wytypuj 6 liczb z 49: ");

        for (int i = 1; i <=6; i++) {
            System.out.println("Wprowadź " + i + " liczbę: ");
            liczbaTypowana = czytnik.nextInt();
        }

        Random r = new Random();

        for (int i = 1; i <= 6; i++) {

            liczbaWylosowana = r.nextInt(49);
            System.out.println("Liczby wylosowane to: " + liczbaWylosowana + ",");
        }


    }
}
