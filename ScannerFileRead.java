import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileRead {
    public static void main(String[] args) {
        
        // Рекомендуемый способ: try-with-resources
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            
            // Чтение всего файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
