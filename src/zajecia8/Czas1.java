package zajecia8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Czas1 {
    public static void main(String[] args) {


        String tekst = "2016 05 03";

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate data = LocalDate.parse(tekst, f);

        System.out.println(data);
    }
}