import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Демонстрация работы метода read() класса InputStream.
 * 
 * Метод read() читает один байт данных из потока ввода.
 * Возвращает:
 * - int от 0 до 255 (значение прочитанного байта)
 * - -1 если достигнут конец потока
 */
public class InputStreamReadDemo {
    public static void main(String[] args) {
        
        // Создаём массив байтов для демонстрации
        String text = "Привет, мир!";
        byte[] data = text.getBytes(StandardCharsets.UTF_8);
        
        System.out.println("=== Демонстрация метода read() ===\n");
        System.out.println("Исходная строка: " + text);
        System.out.println("Байтовое представление (" + data.length + " байт):\n");
        
        // 1. Чтение через ByteArrayInputStream (подкласс InputStream)
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
            
            int byteValue;
            int position = 0;
            
            System.out.println("Побайтовое чтение:");
            // Читаем по одному байту, пока не достигнут конец потока
            while ((byteValue = bais.read()) != -1) {
                System.out.printf("  байт[%d] = %d (0x%02X) символ: %c%n", 
                                  position++, byteValue, byteValue, 
                                  byteValue >= 32 && byteValue <= 126 ? (char)byteValue : '?');
            }
            System.out.println("\nВсего прочитано байт: " + position);
            
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // 2. Демонстрация чтения из файла
        System.out.println("\n=== Чтение из файла ===");
        
        // Сначала создадим тестовый файл
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            fos.write("Hello, World!".getBytes());
        } catch (IOException e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
        }
        
        // Теперь прочитаем его побайтово
        try (FileInputStream fis = new FileInputStream("test.txt")) {
            int b;
            System.out.print("Содержимое файла (побайтово): ");
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        
        // 3. Демонстрация read(byte[]) - чтение массива байт
        System.out.println("\n=== Метод read(byte[]) ===");
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
            byte[] buffer = new byte[5];
            int bytesRead = bais.read(buffer);
            System.out.println("Прочитано " + bytesRead + " байт: " + 
                               new String(buffer, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
