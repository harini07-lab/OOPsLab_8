package Lab8;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();
        int first = text.indexOf("the");
        int last = text.lastIndexOf("the");
        if (first == -1 || last == -1 || first == last) {
            System.out.println("The word 'the' does not appear at least twice.");
        } else {
            String result = text.substring(first + 3, last);
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
            System.out.println("Extracted string: " + result);
        }

        sc.close();
    }
}