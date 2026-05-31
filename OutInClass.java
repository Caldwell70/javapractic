/**
 * Внешний класс имеет доступ к полям и методам внутреннего класса, 
 * но ограничения спецификаторов доступа действуют так же, 
 * как и для обычных классов. 
 * Доступ возможен только через объект внутреннего класса.
 * 
 * Демонстрация доступа внешнего класса к членам внутреннего класса.
 */
public class OutInClass {
    
    // Метод внешнего класса для демонстрации доступа
    public void demonstrateAccess() {
        System.out.println("=== Доступ внешнего класса к членам внутреннего ===\n");
        
        // Создаём объект внутреннего класса
        InnerClass inner = new InnerClass();
        
        // Доступ к public членам - доступен
        System.out.println("publicField: " + inner.publicField);
        inner.publicMethod();
        
        // Доступ к protected членам - доступен (внешний класс в том же пакете)
        System.out.println("protectedField: " + inner.protectedField);
        inner.protectedMethod();
        
        // Доступ к package-private членам - доступен (в том же пакете)
        System.out.println("packageField: " + inner.packageField);
        inner.packageMethod();
        
        // Доступ к private членам - НЕДОСТУПЕН
        // System.out.println(inner.privateField) -> Ошибка!
        // inner.privateMethod();                 -> Ошибка!
        
        // Доступ к static членам внутреннего класса
        System.out.println("\nstaticPublicField: " + InnerClass.staticPublicField);
        InnerClass.staticPublicMethod();
        
        // static private поле - недоступно
        // System.out.println(InnerClass.staticPrivateField) -> Ошибка!
    }
    
    /**
     * Внутренний класс с разными спецификаторами доступа.
     */
    public class InnerClass {
        // Поля с разными спецификаторами
        public String publicField = "Публичное поле внутреннего класса";
        protected String protectedField = "Защищённое поле внутреннего класса";
        String packageField = "Пакетное поле внутреннего класса";
        private String privateField = "Приватное поле внутреннего класса";
        
        // Статические поля (только final разрешены в нестатическом внутреннем классе)
        public static final String staticPublicField = "Статическое публичное поле";
        private static final String staticPrivateField = "Статическое приватное поле";
        
        // Методы с разными спецификаторами
        public void publicMethod() {
            System.out.println("  Вызван public метод внутреннего класса");
        }
        
        protected void protectedMethod() {
            System.out.println("  Вызван protected метод внутреннего класса");
        }
        
        void packageMethod() {
            System.out.println("  Вызван package-private метод внутреннего класса");
        }
        
        private void privateMethod() {
            System.out.println("  Вызван private метод внутреннего класса");
        }
        
        // Статические методы
        public static void staticPublicMethod() {
            System.out.println("  Вызван static public метод внутреннего класса");
        }
        
        private static void staticPrivateMethod() {
            System.out.println("  Вызван static private метод внутреннего класса");
        }
    }
    
    public static void main(String[] args) {
        OutInClass outer = new OutInClass();
        outer.demonstrateAccess();
    }
}
