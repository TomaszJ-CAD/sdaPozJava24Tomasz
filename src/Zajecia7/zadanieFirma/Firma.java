package Zajecia7.zadanieFirma;

public class Firma {

    public static void main(String[] args) {

// tworzę obiekt Menu

        Menu menu = new Menu();
        ListaPracownikow listaPracownikow = new ListaPracownikow();

        String akcja = " ";
        while (!akcja.equals("e") && !akcja.equals("q")) {

            menu.pokazGlowneMenu();
            akcja = menu.pobierzAkcjeOdUzytkowika();

            switch (akcja) {
                case "1": /* wyświetlić użytkownik*/
                    listaPracownikow.wypiszWszystkichPracownikow();
                    break;
                case "2": /* dodaj użytkownika*/
                    listaPracownikow.dodajNowegoPracownika();
                    break;
                case "4":
                    listaPracownikow.wypiszWszystkichPracownikow();
                    listaPracownikow.usunPracownika();
                    break;
                case "q":
                case "e":
                    System.out.println("KONIEC");
                    break;

                default:
                    System.out.println("Podano nieprawidłową akcję!!!");
            }

        }
    }
}
