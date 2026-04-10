package Lab8;
import java.util.Scanner;
import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3);
            } else {
                names[i] = ""; // if name has <= 3 chars
            }
        }
        Arrays.sort(names);
        System.out.println("\nNames after processing and sorting:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
