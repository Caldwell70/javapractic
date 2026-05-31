import java.util.ArrayList;
import java.util.List;

/**
 * Использование instanceof с объектами параметризованных классов.
 * 
 * instanceof проверяет только сырой тип (raw type),
 * так как информация о generic-типе стирается после компиляции.
 */
public class InstanceofGeneric {
    
    public static void main(String[] args) {
        
        // Создаем объекты параметризованных классов
        Wrapper<String> stringWrapper = new Wrapper<>("Привет");
        Wrapper<Integer> integerWrapper = new Wrapper<>(100);
        List<String> stringList = new ArrayList<>();
        
        // 1. Проверка без учета параметра типа (используется сырой тип)
        System.out.println("stringWrapper instanceof Wrapper: " + (stringWrapper instanceof Wrapper));
        System.out.println("integerWrapper instanceof Wrapper: " + (integerWrapper instanceof Wrapper));
        // Оба true, так как instanceof игнорирует параметр типа
        
        // 2. Нельзя проверить конкретный параметр типа
        // System.out.println(stringWrapper instanceof Wrapper<String>); - ошибка
        
        // 3. Проверка с wildcard
        System.out.println("stringWrapper instanceof Wrapper<?>: " + (stringWrapper instanceof Wrapper<?>));
        
        // 4. Проверка с List
        System.out.println("stringList instanceof List: " + (stringList instanceof List));
        System.out.println("stringList instanceof ArrayList: " + (stringList instanceof ArrayList));
    }
}

/**
 * Простой generic-класс для демонстрации
 */
class Wrapper<T> {
    private T item;
    
    public Wrapper(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}
