/**
 * Перегрузка методов с переменным числом параметров (varargs).
 * 
 * Varargs (переменное количество аргументов) обозначается троеточием ...
 * Компилятор автоматически преобразует аргументы в массив.
 * 
 * Важные правила перегрузки:
 * 1. Тип varargs-параметра должен отличаться
 * 2. Или отличаться порядком обычных параметров
 * 3. Метод с varargs имеет наименьший приоритет при перегрузке
 */
public class VarargsOverload {
    
    // 1. Varargs с типом int
    public static void print(String title, int... numbers) {
        System.out.print(title + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // 2. Перегрузка: varargs с типом String
    public static void print(String title, String... strings) {
        System.out.print(title + ": ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    // 3. Перегрузка: varargs с типом double
    public static void print(String title, double... values) {
        System.out.print(title + ": ");
        for (double val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       
        // Вызов метода с int varargs
        print("Числа (int)", 1, 2, 3, 4, 5);
        
        // Вызов метода с String varargs
        print("Строки", "A", "B", "C", "D");
        
        // Вызов метода с double varargs
        print("Дробные", 1.1, 2.2, 3.3);
    }
}
