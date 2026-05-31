/**
 * Демонстрация трёх аннотаций: @Override, @Deprecated, @SuppressWarnings
 * 
 * /@Override - Указывает, что метод переопределяет метод суперкласса 
 * или реализует метод интерфейса.
 * /@Deprecated - Помечает элемент (класс, метод, поле) как устаревший.
 * /@SuppressWarnings - Подавляет предупреждения компилятора для 
 * аннотированного элемента и всех его вложенных элементов.
 */
public class AnnotationDemo {
    
    // Устаревший метод
    @Deprecated
    public static void oldMethod() {
        System.out.println("Старый метод - не используйте");
    }
    
    // Новый метод вместо устаревшего
    public static void newMethod() {
        System.out.println("Новый метод");
    }
    
    public static void main(String[] args) {
        // Подавляем предупреждение об использовании deprecated метода
        @SuppressWarnings("deprecation")
        String result = callLegacyCode();
        
        System.out.println("Результат: " + result);
        newMethod();
    }
    
    @SuppressWarnings("deprecation")
    private static String callLegacyCode() {
        oldMethod();
        return "OK";
    }
}

// Класс с переопределением метода
class Parent {
    public void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override  // Проверяет, что метод действительно переопределён
    public void show() {
        System.out.println("Child");
    }
}
