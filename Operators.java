/**
 * Демонстрирует все операторы:
 * - операторы () и []
 * - операторы ++, --, ~, !
 * - арифметических операторов,
 * - операторов сравнения,
 * - логических операторов,
 * - тернарного оператора,
 * - операторов присваивания,
 * - операторов инкремента/декремента (префиксная и постфиксная форма),
 * - конкатенации строк.
 */
public class Operators {
    public static void main(String[] args) {
        
        // 1. Операторы ( ) и [ ]
        
        // Круглые скобки () меняют приоритет выполнения операций
        System.out.println("Без скобок 2+3*4=" + 2 + 3 * 4 + ", со скобками (2+3)*4=" + (2 + 3) * 4);
        
        // Квадратные скобки [] для доступа к элементам массива
        int[] numbers = {10, 20, 30, 40, 50};
        // numbers[2] — доступ к элементу с индексом 2 (третий элемент)
        System.out.println("numbers[2] = " + numbers[2]);
        // Можно менять значение через []
        numbers[2] = 99;
        System.out.println("После numbers[2]=99: " + numbers[2]);
        
        // 2. операторы ++, --, ~, !
        
        // ++ инкремент (увеличение на 1)
        int a = 5;
        System.out.println("\n--- Инкремент/декремент ---");
        System.out.println("Исходное a=5");
        System.out.println("Постфиксный a++: " + (a++) + " (сначала вернул 5, потом a=6)");
        System.out.println("После a++: a=" + a);
        
        a = 5;
        System.out.println("Префиксный ++a: " + (++a) + " (сначала увеличил до 6, потом вернул 6)");
        
        // -- декремент (уменьшение на 1)
        int b = 5;
        System.out.println("\nПостфиксный b--: " + (b--) + " (вернул 5, потом b=4)");
        b = 5;
        System.out.println("Префиксный --b: " + (--b) + " (уменьшил до 4, вернул 4)");
        
        // ~ побитовое НЕ (инвертирует все биты числа)
        int c = 5; // двоичное представление: 0000 0101
        int inverted = ~c; // результат: 1111 1010 (что равно -6 в десятичной системе)
        System.out.println("\n--- Побитовое НЕ (~) ---");
        System.out.println("c = " + c + " (двоично: 00000101)");
        System.out.println("~c = " + inverted + " (инверсия всех битов)");
        
        // ! логическое НЕ (инвертирует boolean значение)
        boolean flag = true;
        System.out.println("\n--- Логическое НЕ (!) ---");
        System.out.println("flag = " + flag);
        System.out.println("!flag = " + !flag);
      
        // 3. Остальные операторы
        
        // Арифметические
        System.out.println("\n--- Арифметические ---");
        System.out.println("10 + 3 = " + (10 + 3));
        System.out.println("10 - 3 = " + (10 - 3));
        System.out.println("10 * 3 = " + (10 * 3));
        System.out.println("10 / 3 = " + (10 / 3) + " (целочисленное деление)");
        System.out.println("10 % 3 = " + (10 % 3) + " (остаток)");
        
        // Сравнения
        System.out.println("\n--- Сравнения ---");
        System.out.println("10 == 3: " + (10 == 3));
        System.out.println("10 != 3: " + (10 != 3));
        System.out.println("10 > 3: " + (10 > 3));
        System.out.println("10 < 3: " + (10 < 3));
        System.out.println("10 >= 3: " + (10 >= 3));
        System.out.println("10 <= 3: " + (10 <= 3));
        
        // Логические
        boolean t = true, f = false;
        System.out.println("\n--- Логические ---");
        System.out.println("true && false = " + (t && f)); // И
        System.out.println("true || false = " + (t || f)); // ИЛИ
        System.out.println("true ^ false = " + (t ^ f)); // XOR
        
        // Побитовые (кроме ~)
        System.out.println("\n--- Побитовые (& | ^ >> << >>>) ---");
        System.out.println("6 & 3 = " + (6 & 3) + " (побитовое И)");
        System.out.println("6 | 3 = " + (6 | 3) + " (побитовое ИЛИ)");
        System.out.println("6 ^ 3 = " + (6 ^ 3) + " (побитовое XOR)");
        System.out.println("6 >> 1 = " + (6 >> 1) + " (сдвиг вправо)");
        System.out.println("6 << 1 = " + (6 << 1) + " (сдвиг влево)");
        
        // Тернарный
        System.out.println("\n--- Тернарный (?:) ---");
        int age = 18;
        System.out.println(age >= 18 ? "Совершеннолетний" : "Несовершеннолетний");
        
        // Присваивания
        System.out.println("\n--- Присваивания (= += -= *= /= %=) ---");
        int v = 10;
        v += 5; System.out.print("+=5: " + v + ", ");
        v -= 3; System.out.print("-=3: " + v + ", ");
        v *= 2; System.out.print("*=2: " + v + ", ");
        v /= 4; System.out.print("/=4: " + v + ", ");
        v %= 3; System.out.println("%=3: " + v);
        
        // Конкатенация строк
        System.out.println("\n--- Конкатенация строк ---");
        String s = "Java";
        System.out.println("\"Привет, \" + s = " + ("Привет, " + s));
        s += "!";
        System.out.println("s += \"!\" -> " + s);
    }
}
