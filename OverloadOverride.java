/**
 * Перегрузка (overloading) и переопределение (overriding) методов.
 * 
 * Перегрузка - несколько методов с одинаковым именем, но разными параметрами.
 * Переопределение - подкласс изменяет реализацию метода суперкласса.
 */
public class OverloadOverride {
    
    // Перегрузка
    // Все методы называются одинаково "multiply", но принимают разные параметры
    
    // Метод для двух целых чисел
    int multiply(int a, int b) {
        return a * b;
    }
    
    // Перегрузка: три целых числа
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Перегрузка: два дробных числа
    double multiply(double a, double b) {
        return a * b;
    }
    
    // Переопределение    
    // Суперкласс (родитель)
    static class Vehicle {
        String getInfo() {
            return "Транспортное средство";
        }
    }
    
    // Подкласс переопределяет метод getInfo()
    static class Car extends Vehicle {
        @Override
        String getInfo() {
            return "Автомобиль";
        }
    }
}
