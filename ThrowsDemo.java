/**
 * Демонстрация с использованием throws для неперехваченного исключения.
 */
public class ThrowsDemo {
    
    public static void main(String[] args) {
        
        System.out.println("=== Перехваченное vs Неперехваченное исключение ===\n");
        
        // ПЕРЕХВАЧЕННОЕ исключение
        try {
            validateAge(-5);  // IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("ПЕРЕХВАЧЕНО: " + e.getMessage());
            System.out.println("Программа продолжает работу!\n");
        }
        
        // НЕПЕРЕХВАЧЕННОЕ исключение
        System.out.println("Попытка вызова метода, бросающего неперехваченное исключение...");
        dangerousMethod();  // Исключение не перехвачено → аварийная остановка
        
        System.out.println("Этот код не выполнится");
    }
    
    /**
     * Метод, выбрасывающий перехваченное исключение.
     */
    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным: " + age);
        }
        System.out.println("Возраст корректен: " + age);
    }
    
    /**
     * Метод, выбрасывающий неперехваченное исключение.
     */
    public static void dangerousMethod() {
        int[] arr = new int[3];
        int value = arr[10];  // ArrayIndexOutOfBoundsException
    }
}
