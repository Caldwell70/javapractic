/**
 * Интерфейс с default и static методами.
 */
interface Vehicle {
    
    // Абстрактный метод - класс обязан реализовать
    void start();
    
    // Default метод - неабстрактный, может быть переопределён
    default void stop() {
        System.out.println("Транспорт остановлен");
    }
    
    // Static метод - принадлежит интерфейсу
    static void horn() {
        System.out.println("Сигнал: Би-бип!");
    }
}

/**
 * Класс, реализующий интерфейс.
 */
class Car implements Vehicle {
    
    @Override
    public void start() {
        System.out.println("Машина: Двигатель заведён");
    }
    
    // Переопределение default метода (опционально)
    @Override
    public void stop() {
        System.out.println("Машина: Нажаты тормоза");
    }
}

/**
 * Демонстрация всех способов вызова.
 */
public class InterfaceMethodDemo {
    public static void main(String[] args) {
        Car car = new Car();
        
        // 1. Вызов абстрактного метода (реализован в Car)
        car.start();
        
        // 2. Вызов default метода (переопределён в Car)
        car.stop();
        
        // 3. Вызов default метода из интерфейса через переменную типа интерфейса
        Vehicle vehicle = new Car();
        vehicle.stop();
        
        // 4. Вызов static метода через имя интерфейса
        Vehicle.horn();
        
        // 5. Нельзя вызвать static метод через объект
        // car.horn(); // Ошибка!
    }
}
