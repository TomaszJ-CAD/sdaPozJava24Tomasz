package zajecia8;

/*9.2  PrintArrayInStars (Array)

        Write a program called printArrayInStars which prompts user for the number
        of items in an array (a non-negative integer), and saves it in an int variable called numItems.
        It then prompts user for the values of all the items (non-negative integers)
        and saves them in an int array called items.
        The program shall then print the contents of the array in a graphical form,
        with the array index and values represented by number of stars. For examples,*/

import java.util.Scanner;

public class CH9_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numItems;
        int[] items;
        do {
            System.out.print("Podaj liczbę elemetnów:");
            if (scanner.hasNextInt()) {     // czy została wygenerowana dana liczba
                numItems = scanner.nextInt();
                scanner.nextLine();// czyścimy scanner
                break;
            } else {
                scanner.nextLine();// czyścimy też
            }
        } while (true);
        items = new int[numItems];
        for (int i = 0; i < items.length; i++) {
            do {
                System.out.print("Podaj wartość dla elementu nr " + i + ":");
                if (scanner.hasNextInt()) {
                    items[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                }
            } while (true);
        }
        for (int i = 0; i < items.length; i++) {
            System.out.print(i + ": " + "*".repeat(items[i]));
            System.out.println("(" + items[i] + ")");
        }
    }
}
