/**
 * Три варианта использования ключевого слова super.
 * 
 * 1. super(параметры) - вызов конструктора суперкласса
 * 2. super.поле - доступ к полю суперкласса (если скрыто полем подкласса)
 * 3. super.метод() - доступ к методу суперкласса (если переопределён)
 */
public class SuperUsage {
    
    static class Parent {
        String name = "Родитель";
        
        Parent() {
            System.out.println("Конструктор Parent без параметров");
        }
        
        Parent(String msg) {
            System.out.println("Конструктор Parent: " + msg);
        }
        
        void show() {
            System.out.println("Метод show() из Parent");
        }
    }
    
    static class Child extends Parent {
        String name = "Ребёнок";
        
        // 1. Вызов конструктора суперкласса
        Child() {
            super("Вызов через super()"); // вызов конструктора Parent(String)
            System.out.println("Конструктор Child");
        }
        
        void printNames() {
            // 2. Доступ к полю суперкласса
            System.out.println("super.name = " + super.name); // Родитель
            System.out.println("this.name = " + this.name); // Ребёнок
        }
        
        @Override
        void show() {
            // 3. Доступ к методу суперкласса
            super.show(); // вызов метода Parent
            System.out.println("Метод show() из Child");
        }
    }
    
    public static void main(String[] args) {
        Child child = new Child();
        child.printNames();
        child.show();
    }
}
