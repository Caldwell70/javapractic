/**
 * Пример переопределения метода.
 * Суперкласс - Родитель, подкласс - Ребёнок.
 */
public class OverrideExample {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        
        System.out.println("Parent.getNumber(): " + p.getNumber());        // 1
        System.out.println("Child.getNumber(): " + c.getNumber());         // 1 (int)
        System.out.println("Child.getDouble(): " + c.getDouble());         // 1.0
        System.out.println("Child.getObject(): " + c.getObject());         // Child
    }
}

class Parent {
    // Базовые методы
    public int getNumber() {
        return 1;
    }
    
    public Object getObject() {
        return new Parent();
    }
}

class Child extends Parent {
    // Совпадающий тип - работает
    @Override
    public int getNumber() {
        return 1;
    }
    
    // Нельзя переопределить с другим примитивным типом
    // public double getNumber() { return 1.0; } -> Ошибка!
    
    // Это не переопределение, а перегрузка (другое имя)
    public double getDouble() {
        return 1.0;
    }
    
    // Ковариантный тип - работает (Child extends Object)
    @Override
    public Child getObject() {
        return new Child();
    }
    
    // Нельзя вернуть несвязанный тип
    // public String getObject() { return "text"; } -> Ошибка!
}
