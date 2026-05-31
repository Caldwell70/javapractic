/**
 * Интерфейс с вложенным классом.
 */
interface Calculator {
    
    int add(int a, int b);
    int subtract(int a, int b);
    
    /**
     * Вложенный класс (автоматически public static).
     * Предоставляет утилитарные методы для работы с калькулятором.
     */
    class Helper {
        
        public static void printResult(String operation, int result) {
            System.out.println("Результат " + operation + ": " + result);
        }
        
        public static boolean isPositive(int number) {
            return number > 0;
        }
        
        public static int validate(int number, int defaultValue) {
            return number < 0 ? defaultValue : number;
        }
    }
}

/**
 * Реализация интерфейса.
 */
class BasicCalculator implements Calculator {
    
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

/**
 * Демонстрация использования.
 */
public class NestedClass {
    public static void main(String[] args) {
        
        // 1. Вызов статических методов вложенного класса через интерфейс
        System.out.println("=== Вызов через интерфейс ===");
        Calculator.Helper.printResult("сложения", 10 + 5);
        Calculator.Helper.printResult("вычитания", 20 - 8);
        
        // 2. Проверка через вложенный класс
        int value = -5;
        System.out.println("\n=== Проверка значения ===");
        System.out.println("Число " + value + " положительное? " + 
                           Calculator.Helper.isPositive(value));
        
        int validValue = Calculator.Helper.validate(value, 0);
        System.out.println("После валидации: " + validValue);
        
        // 3. Использование с реализацией интерфейса
        System.out.println("\n=== Использование с реализацией ===");
        BasicCalculator calc = new BasicCalculator();
        int sum = calc.add(15, 25);
        Calculator.Helper.printResult("сложения", sum);
    }
}
