package Zajecia7.zadanie13;

/*13. Napisz program który rysuje trójkąty jak na załączonym obrazku:*/

import java.util.Scanner;

public class zad13a {

    public static void main(String[] args) {

        int iloscWierszy;
        int iloscKolumn;

        System.out.println("Podaj ilość wierszy (wysokość trójkąta):");
        Scanner czytnik = new Scanner(System.in);
        iloscWierszy = czytnik.nextInt();

        iloscKolumn = iloscWierszy;

        for (int i = 0; i < iloscWierszy ; i++) {
            for (int j = 0; j < iloscWierszy ; j++) {
                if (j > i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("# ");

        }




    }
}
