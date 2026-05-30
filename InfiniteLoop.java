/**
 * Примеры бесконечных циклов.
 */
public class InfiniteLoops {
    public static void main(String[] args) {
        
        // Бесконечный цикл while
        // Условие всегда true → цикл никогда не завершится
        
        while(true) {
            System.out.println("Этот цикл бесконечный");
        }
        
        
        // Условие, которое никогда не станет false
        
        int a = 10;
        while(a > 0) {
            System.out.println("a никогда не уменьшается => бесконечный цикл");
        }
        
        
        // Бесконечный цикл do-while
        // Условие всегда true
        
        do {
            System.out.println("Этот цикл бесконечный");
        } while(true);
        
        
        // Условие, которое никогда не изменится
        
        boolean flag = true;
        do {
            System.out.println("flag всегда true");
        } while(flag);
        
    }
}
