package zajecia8;

/*Zadanie 5.6 Napisać program, który wczytuje datę w
        formacie 2018-06-22 a wypisuje w formacie 22.06.2018*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Czas2 {

    public static void main(String[] args) {

        //LocalDateTime dataCzas = LocalDateTime.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate l1 = LocalDate.parse("2018-06-22", f1);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String tekst = l1.format(f2);

        System.out.print(tekst);
    }
}
