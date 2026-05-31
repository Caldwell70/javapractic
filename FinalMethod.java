/**
 * final-метод нельзя переопределить в подклассе.
 */
public class FinalMethod {
    
    // Суперкласс с final-методом
    static class Parent {
        
        // Обычный метод (можно переопределить)
        public void normalMethod() {
            System.out.println("Обычный метод Parent");
        }
        
        // final-метод (нельзя переопределить)
        public final void finalMethod() {
            System.out.println("final-метод Parent - его нельзя изменить");
        }
    }
    
    // Подкласс пытается переопределить final-метод
    static class Child extends Parent {
        
        // Это работает - обычный метод переопределён
        @Override
        public void normalMethod() {
            System.out.println("Переопределённый метод Child");
        }
        
        // Это не скомпилируется - нельзя переопределить final-метод
        /*
        @Override
        public void finalMethod() {
            System.out.println("Попытка переопределить final-метод");
        }
        */
    }
    
    public static void main(String[] args) {
        Child child = new Child();
        
        child.normalMethod(); // Работает
        child.finalMethod(); // Работает (унаследован от Parent)
        
        System.out.println("\nfinal-метод унаследован, но переопределить его нельзя");
    }
}
