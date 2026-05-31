import java.io.*;

/**
 * Демонстрация работы метода write(int) класса OutputStream.
 * 
 * Метод write(int b) записывает один байт в выходной поток.
 * Записываются младшие 8 бит переданного int значения.
 */
public class OutputStreamWriteDemo {
    public static void main(String[] args) {
        
        System.out.println("=== Демонстрация метода write(int) ===\n");
        
        // 1. Запись в массив байтов через ByteArrayOutputStream
        System.out.println("1. Запись в ByteArrayOutputStream:");
        
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            
            // Записываем отдельные байты
            baos.write(72);  // 'H'
            baos.write(101); // 'e'
            baos.write(108); // 'l'
            baos.write(108); // 'l'
            baos.write(111); // 'o'
            baos.write(32);  // пробел
            baos.write(87);  // 'W'
            baos.write(111); // 'o'
            baos.write(114); // 'r'
            baos.write(108); // 'l'
            baos.write(100); // 'd'
            baos.write(33);  // '!'
            
            byte[] result = baos.toByteArray();
            System.out.println("   Записанные данные: " + new String(result));
            
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // 2. Демонстрация: write(int) использует только младшие 8 бит
        System.out.println("\n2. Демонстрация отбрасывания старших битов:");
        
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            // Записываем число 300 (двоичное: 1 0010 1100)
            // Младшие 8 бит: 0010 1100 = 44 (символ ',')
            baos.write(300);
            
            // Записываем число 44 (символ ',') для сравнения
            baos.write(44);
            
            byte[] result = baos.toByteArray();
            System.out.println("   write(300) и write(44) дают одинаковый результат:");
            System.out.println("   " + new String(result) + " (оба байта равны 44)");
            
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // 3. Запись в файл
        System.out.println("\n3. Запись в файл:");
        
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String message = "Java I/O";
            for (char c : message.toCharArray()) {
                fos.write((int) c);  // записываем каждый символ как int
            }
            System.out.println("   Строка '" + message + "' записана в файл output.txt");
            
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // 4. Проверка содержимого файла
        System.out.println("\n4. Проверка содержимого файла:");
        try (FileInputStream fis = new FileInputStream("output.txt")) {
            int b;
            System.out.print("   Содержимое: ");
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        
        // 5. Демонстрация записи массива байт write(byte[])
        System.out.println("\n5. Метод write(byte[]) для записи массива:");
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] data = {65, 66, 67, 68, 69};  // A, B, C, D, E
            baos.write(data);
            System.out.println("   Записан массив: " + new String(baos.toByteArray()));
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
