
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] arrayLine = line.split(",");
                System.out.println(arrayLine[0] + ", age: " + arrayLine[1] + " years");                
        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}