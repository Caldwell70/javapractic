/**
 * final-класс нельзя расширить (нельзя создать подкласс).
 */
public class Final {
    
    // final-класс - от него нельзя наследоваться
    final class FinalClass {
        private String name = "Финальный класс";
        
        public String getName() {
            return name;
        }
    }
    
    class Child extends FinalClass { 
    // Ошибка компиляции: Cannot inherit from final 'FinalClass'
    
        public void show() {
            System.out.println("Метод подкласса.");
        }
    }
}
