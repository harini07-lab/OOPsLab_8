package Lab8;
import java.io.*;
public class Q5 {
    public static void main(String[] args) {
        try {
            // Step 1: Open file for reading
            BufferedReader br = new BufferedReader(new FileReader("/Users/kashyap/Desktop/100 days of python/100 days of code udemy/Lab8/sdj.txt"));
            String line;
            System.out.println("Modified content:\n");
            // Step 2: Read file line by line
            while ((line = br.readLine()) != null) {
                // Step 3: Replace "his" with "her"
                String modifiedLine = line.replaceAll("\\bhis\\b", "her");
                // Step 4: Print result
                System.out.println(modifiedLine);
            }
            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
