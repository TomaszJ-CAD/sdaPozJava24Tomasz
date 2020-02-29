package zajecia8;

/*Zadanie:podzielić poniższe zdanie na tablice z wyrazami.
        "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale."*/

import java.util.Arrays;

public class RegEx {

    public static void main(String[] args) {

        String zdanie = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript, Pythona, Scale.";

          String[] words = zdanie.split("[ .,:]+");
        System.out.println(words.length + " " + Arrays.toString(words));


//        Zadanie: zastąpić w zdaniu, każde wystąpienie litery a znakiem @.

        String newZdanie = zdanie.replaceAll("a", "@");
        System.out.println(newZdanie);

//        Zadanie dla chętnych: Zamienić w słowach kończących się na literę a na @




    }
}
