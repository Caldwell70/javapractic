/**
 * Класс, использующий собственное исключение.
 */
public class UserValidator {
    
    /**
     * Проверяет корректность возраста.
     * @param age проверяемый возраст
     * @throws InvalidAgeException если возраст некорректен
     */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Возраст не может быть отрицательным: " + age);
        }
        if (age > 150) {
            throw new InvalidAgeException("Возраст не может превышать 150 лет: " + age);
        }
        if (age < 18) {
            throw new InvalidAgeException("Доступ разрешён только с 18 лет. Ваш возраст: " + age);
        }
        System.out.println("Возраст " + age + " корректен");
    }
    
    public static void main(String[] args) {
        
        System.out.println("=== Демонстрация собственного исключения ===\n");
        
        // Тест 1: отрицательный возраст
        try {
            System.out.println("Проверка возраста -5:");
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("   Ошибка: " + e.getMessage());
        }
        
        // Тест 2: возраст больше 150
        try {
            System.out.println("\nПроверка возраста 200:");
            validateAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("   Ошибка: " + e.getMessage());
        }
        
        // Тест 3: возраст меньше 18
        try {
            System.out.println("\nПроверка возраста 16:");
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("   Ошибка: " + e.getMessage());
        }
        
        // Тест 4: корректный возраст
        try {
            System.out.println("\nПроверка возраста 25:");
            validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("   Ошибка: " + e.getMessage());
        }
        
        // Тест 5: демонстрация цепочки исключений
        try {
            try {
                throw new InvalidAgeException("Проблема с возрастом", new IllegalArgumentException("Исходная ошибка"));
            } catch (InvalidAgeException e) {
                System.out.println("\nДемонстрация цепочки исключений:");
                System.out.println("   Сообщение: " + e.getMessage());
                System.out.println("   Причина: " + e.getCause());
                System.out.println("   Тип причины: " + e.getCause().getClass().getSimpleName());
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
