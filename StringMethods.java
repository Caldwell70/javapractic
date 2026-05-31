/**
 * Демонстрация десяти методов класса String.
 */
public class StringMethods {
    public static void main(String[] args) {
        
        String str = "   Привет, мир!   ";
        String name = "Арюна";
        
        // 1. length() - возвращает длину строки (количество символов)
        System.out.println("1. length(): " + str.length());  // 18
        
        // 2. trim() - удаляет пробелы в начале и в конце строки
        String trimmed = str.trim();
        System.out.println("2. trim(): '" + trimmed + "'");  // "Привет, мир!"
        
        // 3. toLowerCase() / toUpperCase() - преобразует регистр
        System.out.println("3. toUpperCase(): " + name.toUpperCase());  // АРЮНА
        System.out.println("   toLowerCase(): " + "JAVA".toLowerCase()); // java
        
        // 4. charAt() - возвращает символ по указанному индексу
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);
        System.out.println("4. charAt(): первый символ '" + firstChar + "', последний '" + lastChar + "'");
        
        // 5. substring() - возвращает часть строки
        String sub1 = name.substring(1);      // с индекса 1 до конца
        String sub2 = name.substring(1, 3);   // с индекса 1 до 3 (не включая 3)
        System.out.println("5. substring(): '" + sub1 + "', '" + sub2 + "'");  // "рюна", "рю"
        
        // 6. indexOf() - возвращает индекс первого вхождения символа/подстроки
        int indexOfM = "Программирование".indexOf('м');
        int indexOfGram = "Программирование".indexOf("грам");
        System.out.println("6. indexOf(): 'м' на позиции " + indexOfM + ", 'грам' на позиции " + indexOfGram);
        
        // 7. contains() - проверяет, содержит ли строка указанную последовательность
        boolean hasWorld = trimmed.contains("мир");
        boolean hasJava = trimmed.contains("Java");
        System.out.println("7. contains(): содержит 'мир'? " + hasWorld + ", содержит 'Java'? " + hasJava);
        
        // 8. replace() / replaceAll() - заменяет символы или подстроки
        String replaced = "Яблоко, яблоко, яблоко".replace("яблоко", "груша");
        System.out.println("8. replace(): " + replaced);
        
        // 9. split() - разбивает строку на массив подстрок по разделителю
        String fruits = "яблоко,груша,банан,апельсин";
        String[] fruitArray = fruits.split(",");
        System.out.print("9. split(): ");
        for (String fruit : fruitArray) {
            System.out.print("[" + fruit + "] ");
        }
        System.out.println();
        
        // 10. equals() / equalsIgnoreCase() - сравнивает строки
        String str1 = "Java";
        String str2 = "java";
        System.out.println("10. equals(): Java equals java? " + str1.equals(str2));                 // false
        System.out.println("    equalsIgnoreCase(): Java equals java? " + str1.equalsIgnoreCase(str2)); // true
    }
}
