package my.exception;
import java.io.FileReader;
import java.io.IOException;

public class TryThrows {

        public static void main(String[] args) {
            readFromFile("example.txt");
        }

        public static void readFromFile(String filename) {
            FileReader reader = null;
            try {
                reader = new FileReader(filename);
                // Code to read from the file
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            } finally {
                try {
                    if (reader != null)
                        reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }


}
