/**
 * Внутренний класс имеет доступ ко всем полям 
 * и методам внешнего класса, включая приватные (private). 
 * Спецификаторы доступа (private, protected, public, package-private) 
 * не ограничивают доступ внутреннего класса к членам внешнего класса.
 * 
 * Демонстрация доступа внутреннего класса к членам внешнего класса.
 */
public class InOutClass {
    
    // Поля с разными спецификаторами доступа
    private String privateField = "Приватное поле";
    protected String protectedField = "Защищённое поле";
    public String publicField = "Публичное поле";
    String packageField = "Пакетное поле";
    
    private static String privateStaticField = "Приватное статическое поле";
    
    // Приватный метод
    private void privateMethod() {
        System.out.println("  Вызван приватный метод внешнего класса");
    }
    
    // Защищённый метод
    protected void protectedMethod() {
        System.out.println("  Вызван защищённый метод внешнего класса");
    }
    
    // Публичный метод
    public void publicMethod() {
        System.out.println("  Вызван публичный метод внешнего класса");
    }
    
    /**
     * Внутренний класс (non-static) - имеет полный доступ к внешнему классу.
     */
    public class InnerClass {
        
        private String innerField = "Поле внутреннего класса";
        
        public void demonstrateAccess() {
            System.out.println("\n--- Доступ из внутреннего класса ---");
            
            // Доступ к полям внешнего класса (все спецификаторы работают)
            System.out.println("  privateField: " + privateField);
            System.out.println("  protectedField: " + protectedField);
            System.out.println("  publicField: " + publicField);
            System.out.println("  packageField: " + packageField);
            System.out.println("  privateStaticField: " + privateStaticField);
            
            // Доступ к методам внешнего класса
            privateMethod();
            protectedMethod();
            publicMethod();
        }
        
        public void modifyOuterFields() {
            System.out.println("\n--- Изменение полей внешнего класса ---");
            
            privateField = "Изменённое приватное поле";
            protectedField = "Изменённое защищённое поле";
            publicField = "Изменённое публичное поле";
            packageField = "Изменённое пакетное поле";
            
            System.out.println("  Все поля успешно изменены!");
        }
        
        public void showModifiedFields() {
            System.out.println("\n--- Состояние полей после изменения ---");
            System.out.println("  privateField: " + privateField);
            System.out.println("  protectedField: " + protectedField);
            System.out.println("  publicField: " + publicField);
            System.out.println("  packageField: " + packageField);
        }
    }
    
    /**
     * Вложенный статический класс (static nested class) - доступ только к static членам.
     */
    public static class StaticNestedClass {
        
        public void demonstrateAccess() {
            System.out.println("\n--- Доступ из статического вложенного класса ---");
            
            // Нет доступа к нестатическим полям
            // System.out.println(privateField) -> Ошибка!
            
            // Доступ только к статическим членам
            System.out.println("  privateStaticField: " + privateStaticField);
        }
    }
    
    public static void main(String[] args) {
        // Создаём внешний класс
        InOutClass outer = new InOutClass();
        
        // Создаём внутренний класс (через объект внешнего)
        InnerClass inner = outer.new InnerClass();
        
        // Демонстрация доступа
        inner.demonstrateAccess();
        inner.modifyOuterFields();
        inner.showModifiedFields();
        
        // Демонстрация статического вложенного класса
        StaticNestedClass staticNested = new StaticNestedClass();
        staticNested.demonstrateAccess();
    }
}
