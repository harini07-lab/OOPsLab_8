package Lab8;
import java.util.Scanner;
public class Q2 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String text = sc.nextLine();
        int isVowel =0 ;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || 
                ch == 'O' || ch == 'U') {
                System.out.println("Vowel: " + ch + " at position: " + i);
                isVowel=1;
            }
        }
        if(isVowel==0){
            System.out.println("No vowels in the input.");
        }
        sc.close();
    }
}