import java.io.*;

/**
 * Реальный пример с обработкой нескольких исключений.
 */
public class FileProcessor {
    
    public static void main(String[] args) {
        
        System.out.println("=== Обработка исключений при работе с файлами ===\n");
        
        // Пример 1: Идентичная обработка через multi-catch
        processFileMultiCatch("несуществующий_файл.txt");
        
        // Пример 2: Иерархия исключений ввода-вывода
        readFile("test.txt");
    }
    
    /**
     * Исключения с идентичной обработкой (multi-catch).
     */
    public static void processFileMultiCatch(String filename) {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            System.out.println("Первая строка: " + line);
            br.close();
        } 
        catch (IOException | ArithmeticException e) {
            System.out.println("   ОШИБКА: " + e.getClass().getSimpleName());
            System.out.println("   Сообщение: " + e.getMessage());
        }
    }
    
    /**
     * Иерархия исключений (от частного к общему).
     */
    public static void readFile(String filename) {
        try {
            FileInputStream fis = new FileInputStream(filename);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            System.out.println("Прочитано " + data.length + " байт");
            fis.close();
            
        } catch (FileNotFoundException e) {
            // Самый конкретный - файл не найден
            System.out.println("   [FileNotFoundException] Файл не найден: " + filename);
            
        } catch (IOException e) {
            // Более общий - ошибка ввода-вывода
            System.out.println("   [IOException] Ошибка чтения файла: " + e.getMessage());
            
        } catch (Exception e) {
            // Самый общий - любая другая ошибка
            System.out.println("   [Exception] Непредвиденная ошибка: " + e.getMessage());
        }
    }
}
