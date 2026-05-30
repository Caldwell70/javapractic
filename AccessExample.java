/**
 * Спецификаторы доступа (от самого закрытого к самому открытому):
 * 
 * 1. private   - доступ только внутри класса
 * 2. (default) - доступ внутри пакета (без спецификатора)
 * 3. protected - доступ внутри пакета + подклассы в других пакетах
 * 4. public    - доступ отовсюду
 */

public class AccessExample {
    
    private int privateVar = 1; // только внутри этого класса
    int defaultVar = 2; // доступ в пределах пакета
    protected int protectedVar = 3; // доступ в пакете + подклассы
    public int publicVar = 4; // доступ отовсюду
    
    // Метод внутри того же класса - доступны все поля
    public void showWithinClass() {
        System.out.println("privateVar   (private)   = " + privateVar);
        System.out.println("defaultVar   (default)   = " + defaultVar);
        System.out.println("protectedVar (protected) = " + protectedVar);
        System.out.println("publicVar    (public)    = " + publicVar);
    }
}

class SamePackageClass {
    
    public void testAccess() {
        AccessExample obj = new AccessExample();
        // System.out.println(obj.privateVar); - ошибка, private недоступен
        System.out.println("defaultVar   (default)   = " + obj.defaultVar); // доступ, доступа не будет, если объявить этот класс в другом пакете
        System.out.println("protectedVar (protected) = " + obj.protectedVar); // доступ
        System.out.println("publicVar    (public)    = " + obj.publicVar); // доступ
    }
}
