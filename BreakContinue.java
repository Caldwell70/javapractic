/**
 * Операторы break и continue в циклах.
 * 
 * break  - полностью завершает цикл (выход из него)
 * continue - пропускает текущую итерацию и переходит к следующей
 */
public class BreakContinue {
    public static void main(String[] args) {
                
        // Поиск первого числа, кратного 7, пропуская кратные 3
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("continue: " + i + " кратно 3 => пропускаем");
                continue; // пропускаем числа, кратные 3
            }
            if (i % 7 == 0) {
                System.out.println("break: " + i + " кратно 7 => останавливаем цикл");
                break; // нашли нужное число
            }
        }
    }
}
