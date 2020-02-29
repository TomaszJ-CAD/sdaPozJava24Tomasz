package Zajecia7.zadanie13;

public class Zad13aa {

    public static void main(String[] args) {

        int wiersze = 6;

        for (int i = 0; i < wiersze; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("# " + "{i:" + i + "|j:" + j + "}");

            }

            System.out.println();

        }

    }
}

