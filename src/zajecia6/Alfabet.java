package zajecia6;

public class Alfabet {
    public static void main(String[] args) {

        String alfabet = "abcdefghijklmnopqrstuwxyz";

        for (int i = 0; i < alfabet.length() ; i++) {
            int kod = alfabet.charAt(i);
            System.out.println(kod);
        }
    }
}
