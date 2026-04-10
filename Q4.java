package Lab8;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();
        String result = "";
        boolean capitalize = true;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (capitalize && Character.isLetter(ch)) {
                result += Character.toUpperCase(ch);
                capitalize = false;
            } else {
                result += ch;
            }
            if (ch == ' ') {
                capitalize = true;
            }
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}