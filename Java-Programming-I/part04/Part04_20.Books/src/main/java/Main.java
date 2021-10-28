import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> infoBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Titles: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            infoBook.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed? ");
        String whatToPrint = scanner.nextLine();
        

        for (Book info: infoBook) {
            if (whatToPrint.equals("everything")) {
                System.out.println(info);
                
            }

            if (whatToPrint.equals("name")) {
                System.out.println(info.getName());
                
            }
        }

    }
}
