package zajecia6;

/*5. Napisz program, który oblicza sumę liczb cyfry tj. dla liczby 52 suma jej
        pojedynczych cyfr wynosi ‘5’ + ‘2’ -> ‘7’.
        Podpowiedź: Użyj metody split na obiekcie typu String*/

public class Zadanie5 {

    public static void main(String[] args) {

        String mojaLiczba = "5556";
        int suma = 0;
        for (int i = 0; i < mojaLiczba.length(); i++) {
            char c = mojaLiczba.charAt(i);
            suma += Integer.valueOf(String.valueOf(c));

        }
        System.out.println(suma);
    }
}
