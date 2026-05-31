/**
 * Варианты вызова статического метода.
 * 
 * Статический метод принадлежит классу, а не объекту.
 * Его можно вызвать:
 * 1. Через имя класса
 * 2. Через объект класса
 * 3. Из другого статического метода того же класса
 * 4. Из нестатического метода того же класса
 */
public class StaticMethods {
    
    public static int a = 1;
    public static int b = 10;
    
    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    // 3. Вызов из другого статического метода того же класса
    public static void anotherStaticMethod() {
        System.out.println("\nВызов из статического метода того же класса");
        printVars();
    }
    
    // 4. Вызов из нестатического метода того же класса
    public void nonStaticMethod() {
        System.out.println("\nВызов из нестатического метода того же класса");
        printVars();
    }
    
    public static void main(String[] args) {
        
        // 1. Вызов через имя класса
        System.out.println("1. Через имя класса:");
        StaticMethods.printVars();
        
        // 2. Вызов через объект
        System.out.println("\n2. Через объект класс:");
        StaticMethods obj = new StaticMethods();
        obj.printVars();
        
        // 3. Вызов из другого статического метода
        anotherStaticMethod();
        
        // 4. Вызов из нестатического метода
        StaticMethods obj2 = new StaticMethods();
        obj2.nonStaticMethod();
    }
}
