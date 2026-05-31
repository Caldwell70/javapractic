/**
 * Демонстрация генерации и обработки различных исключений.
 */
public class ExceptionHandlingDemo {
    
    public static void main(String[] args) {
        
        // 1. ArithmeticException - деление на ноль
        System.out.println("=== 1. ArithmeticException ===");
        try {
            int result = 10 / 0;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("   Ошибка: Деление на ноль невозможно!");
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        System.out.println("\n=== 2. ArrayIndexOutOfBoundsException ===");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("   Элемент с индексом 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("   Ошибка: Выход за границы массива!");
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 3. IllegalArgumentException - неверный аргумент метода
        System.out.println("\n=== 3. IllegalArgumentException ===");
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("   Ошибка: " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типов
        System.out.println("\n=== 4. ClassCastException ===");
        try {
            Object obj = "Это строка";
            Integer num = (Integer) obj;  // String нельзя привести к Integer
        } catch (ClassCastException e) {
            System.out.println("   Ошибка: Неверное приведение типа!");
            System.out.println("   Сообщение: " + e.getMessage());
        }
        
        // 5. NullPointerException - обращение к null объекту
        System.out.println("\n=== 5. NullPointerException ===");
        try {
            String text = null;
            int length = text.length();  // Вызов метода на null
            System.out.println("   Длина строки: " + length);
        } catch (NullPointerException e) {
            System.out.println("   Ошибка: Обращение к null объекту!");
            System.out.println("   Сообщение: " + e.getMessage());
        }
    }
    
    /**
     * Метод, который выбрасывает IllegalArgumentException при неверном возрасте.
     */
    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть от 0 до 150. Получено: " + age);
        }
        System.out.println("   Возраст установлен: " + age);
    }
    
    /**
     * Метод с обработкой нескольких исключений.
     */
    public static void processArray(int[] arr, int index) {
        try {
            System.out.print("   Обработка массива: ");
            if (arr == null) {
                throw new NullPointerException("Массив не инициализирован");
            }
            System.out.println("arr[" + index + "] = " + arr[index]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: индекс " + index + " вне границ массива длиной " + arr.length);
        } finally {
            System.out.println("   finally блок выполнен всегда!");
        }
    }
}
