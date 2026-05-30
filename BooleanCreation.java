/**
 * Все способы создания объекта Boolean.
 */
public class BooleanCreation {
    public static void main(String[] args) {
        
        // 1. Через valueOf() — предпочтительный способ (использует кэширование)
        Boolean b5 = Boolean.valueOf(true);
        Boolean b6 = Boolean.valueOf("true");
        Boolean b7 = Boolean.valueOf("false");
        
        // 2. Через автобокс (автоматическая упаковка)
        Boolean b8 = true;    // эквивалентно Boolean.valueOf(true)
        Boolean b9 = false;
        
        // 3. Константы TRUE и FALSE (но это не создание нового объекта,
        //    а получение существующего из кэша)
        Boolean b10 = Boolean.TRUE;
        Boolean b11 = Boolean.FALSE;
        
        // 4. Через parseBoolean() + valueOf() (parseBoolean возвращает примитив)
        boolean primitive = Boolean.parseBoolean("true");
        Boolean b12 = Boolean.valueOf(primitive);
    }
}
