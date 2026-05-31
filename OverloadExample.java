/**
 * Пример перегрузки методов.
 * 
 * Перегрузка методов позволяет создавать несколько методов с одинаковым именем,
 * но разными параметрами (количество, тип или порядок).
 */
public class OverloadExample {
    
    // Сложение двух целых чисел
    public static int sum(int a, int b) {
        return a + b;
    }
    
    // Сложение трёх целых чисел
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // Сложение двух чисел с плавающей точкой
    public static double sum(double a, double b) {
        return a + b;
    }
    
    // Сложение целого и числа с плавающей точкой
    public static double sum(int a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        
        // 1. Вызов метода sum(int, int)
        int result1 = OverloadExample.sum(5, 10);
        System.out.println("sum(5, 10) = " + result1);
        
        // 2. Вызов метода sum(int, int, int)
        int result2 = OverloadExample.sum(5, 10, 15);
        System.out.println("sum(5, 10, 15) = " + result2);
        
        // 3. Вызов метода sum(double, double)
        double result3 = OverloadExample.sum(3.5, 2.5);
        System.out.println("sum(3.5, 2.5) = " + result3);
        
        // 4. Вызов метода sum(int, double)
        double result4 = OverloadExample.sum(5, 2.5);
        System.out.println("sum(5, 2.5) = " + result4);
        
        // 5. Вызов через объект
        System.out.println("\nВызов через объект:");
        OverloadExample obj = new OverloadExample();
        int result5 = obj.sum(2, 3);
        System.out.println("obj.sum(2, 3) = " + result5);
    }
}
