import java.util.Date;

/**
 * Демонстрация использования пяти спецификаторов форматирования.
 */
public class FormatterDemo {
    public static void main(String[] args) {
        
        System.out.println("=== Использование спецификаторов форматирования ===\n");
        
        // 1. %s - строковое представление аргумента
        System.out.println("1. Спецификатор %s (строковое представление):");
        String name = "Арюна";
        int age = 20;
        String str1 = String.format("Имя: %s, Возраст: %d", name, age);
        System.out.println("   " + str1);
        
        // С %s можно выводить любые объекты (вызывается toString())
        Date now = new Date();
        System.out.println("   Текущая дата через %%s: " + String.format("%s", now));
        
        // 2. %d - десятичное целое значение
        System.out.println("\n2. Спецификатор %d (десятичное целое):");
        int number = 255;
        System.out.println("   Число: " + String.format("%d", number));
        System.out.println("   С шириной поля 5: '" + String.format("%5d", number) + "'");
        System.out.println("   С ведущими нулями: '" + String.format("%05d", number) + "'");
        
        // 3. %f - десятичное значение с плавающей точкой
        System.out.println("\n3. Спецификатор %f (плавающая точка):");
        double pi = Math.PI;
        System.out.println("   pi = " + String.format("%f", pi));
        System.out.println("   С 2 знаками после запятой: " + String.format("%.2f", pi));
        System.out.println("   С шириной 10 и 3 знаками: " + String.format("%10.3f", pi));
        
        // 4. %b - логическое значение
        System.out.println("\n4. Спецификатор %b (логическое значение):");
        boolean isAdult = age >= 18;
        boolean isEmpty = "".isEmpty();
        System.out.println("   isAdult (20 >= 18) = " + String.format("%b", isAdult));
        System.out.println("   isEmpty = " + String.format("%b", isEmpty));
        System.out.println("   null = " + String.format("%b", null));
        System.out.println("   Не boolean объект (любой объект): " + String.format("%b", "строка"));
        
        // 5. %n - вставка символа новой строки (платформонезависимо)
        System.out.println("\n5. Спецификатор %n (новая строка):");
        String multiLine = String.format("Первая строка%nВторая строка%nТретья строка");
        System.out.println("   " + multiLine);
    }
}
