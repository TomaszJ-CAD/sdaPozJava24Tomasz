package Zajecia7.zadanieFirma;

import java.util.Scanner;

public class Menu {

    public void pokazGlowneMenu() {

        // pokazuje wszystkie dostępne akcje dla użytkownika
        System.out.println("Witamy w aplikacji Lista pracowników. Wybierz z menu co chciałbyś robić:");
        System.out.println("1 - Wypisywanie listy wszystkich pracowników (okrojone)");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("3 - Eksport danych");
        System.out.println("4 - Usuwanie pracowników");
        System.out.println("5 - Edycja danych");
        System.out.println("e albo q - Zakończenie aplikacji");
    }

    // do obsługi menu
    public String pobierzAkcjeOdUzytkowika() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        return line.toLowerCase();

    }
}
