/**
 * NullPointerException при автоупаковке/автораспаковке.
 */
public class Autounpacking {
    public static void main(String[] args) {
        
        // NullPointerException возникает при распаковке null-объекта
        
        // Пример: Арифметическая операция с null
        try {
            Integer a = null;
            int result = a + 5;  // распаковка null, затем операция
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Ошибка! a + 5 при a=null -> " + e);
        }
    }
}
