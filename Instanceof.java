/**
 * Оператор instanceof
 * Проверяет, является ли объект экземпляром указанного класса,
 * подкласса или реализует ли указанный интерфейс.
 * 
 * instanceof для null всегда возвращает false.
 */
public class Instanceof {
    public static void main(String[] args) {
        
        // 1. instanceof с разными типами
        String str = "Hello";
        Integer num = 42;
        
        // String является экземпляром String и Object (все классы наследуют Object)
        System.out.println("str instanceof String: " + (str instanceof String));   // true
        System.out.println("str instanceof Object: " + (str instanceof Object));   // true
        // Integer не является String
        System.out.println("num instanceof Integer: " + (num instanceof Integer)); // true
        
        // 2. instanceof с null-объектом
        // null не является экземпляром никакого типа
        String nullStr = null;
        System.out.println("nullStr instanceof String: " + (nullStr instanceof String)); // false
        System.out.println("null instanceof Object: " + (null instanceof Object));       // false
        
        // 3. Безопасное приведение типов
        Object obj = "Можно привести к String";
        if (obj instanceof String) {
            String safe = (String) obj;  // Безопасное приведение
            System.out.println("Успешно приведено: " + safe);
        }
        
        // 4. instanceof с иерархией классов
        // Dog является подклассом Animal, поэтому dog считается экземпляром обоих
        Animal dog = new Dog();
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));     // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
    }
}

/**
 * Базовый класс для демонстрации иерархии.
 */
class Animal {}

/**
 * Подкласс Dog. Dog является Animal.
 */
class Dog extends Animal {}
