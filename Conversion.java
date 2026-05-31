/**
 * Демонстрация преобразований между String, StringBuilder и StringBuffer.
 */
public class Conversion {
    public static void main(String[] args) {
        
        System.out.println("=== Преобразование между String, StringBuilder, StringBuffer ===\n");
        
        // Исходная строка
        String originalString = "Привет, мир!";
        System.out.println("Исходная строка: " + originalString);
        System.out.println("Тип: String\n");
        
        // 1. String → StringBuilder
        System.out.println("1. String -> StringBuilder:");
        StringBuilder sb = new StringBuilder(originalString);
        System.out.println("   new StringBuilder(str): " + sb);
        System.out.println("   Тип: " + sb.getClass().getSimpleName());
        
        // 2. String → StringBuffer
        System.out.println("\n2. String -> StringBuffer:");
        StringBuffer sbf = new StringBuffer(originalString);
        System.out.println("   new StringBuffer(str): " + sbf);
        System.out.println("   Тип: " + sbf.getClass().getSimpleName());
        
        // 3. StringBuilder → String
        System.out.println("\n3. StringBuilder -> String:");
        StringBuilder sb2 = new StringBuilder("StringBuilder объект");
        String strFromSb = sb2.toString();
        System.out.println("   sb2.toString(): " + strFromSb);
        System.out.println("   Тип: " + strFromSb.getClass().getSimpleName());
        
        // 4. StringBuffer → String
        System.out.println("\n4. StringBuffer -> String:");
        StringBuffer sbf2 = new StringBuffer("StringBuffer объект");
        String strFromSbf = sbf2.toString();
        System.out.println("   sbf2.toString(): " + strFromSbf);
        System.out.println("   Тип: " + strFromSbf.getClass().getSimpleName());
        
        // 5. StringBuilder → StringBuffer
        System.out.println("\n5. StringBuilder -> StringBuffer:");
        StringBuilder sb3 = new StringBuilder("Из StringBuilder");
        StringBuffer sbf3 = new StringBuffer(sb3);
        System.out.println("   new StringBuffer(sb3): " + sbf3);
        System.out.println("   Тип: " + sbf3.getClass().getSimpleName());
        
        // 6. StringBuffer → StringBuilder
        System.out.println("\n6. StringBuffer -> StringBuilder:");
        StringBuffer sbf4 = new StringBuffer("Из StringBuffer");
        StringBuilder sb4 = new StringBuilder(sbf4);
        System.out.println("   new StringBuilder(sbf4): " + sb4);
        System.out.println("   Тип: " + sb4.getClass().getSimpleName());
        
        // 7. StringBuilder → String → StringBuffer (цепочка)
        System.out.println("\n7. Цепочка преобразований:");
        StringBuilder sb5 = new StringBuilder("Начало");
        System.out.println("   StringBuilder: " + sb5);
        
        String intermediate = sb5.toString();
        System.out.println("   -> String: " + intermediate);
        
        StringBuffer sbf5 = new StringBuffer(intermediate);
        sbf5.append(" -> Конец");
        System.out.println("   -> StringBuffer: " + sbf5);
        
        // 8. substring() возвращает String, можно преобразовать обратно
        System.out.println("\n8. substring() с последующим преобразованием:");
        StringBuilder sb6 = new StringBuilder("Java программирование");
        String sub = sb6.substring(5);  // возвращает String
        StringBuilder sb7 = new StringBuilder(sub);
        sb7.append(" - это интересно");
        System.out.println("   Исходный StringBuilder: " + sb6);
        System.out.println("   После substring() -> String: " + sub);
        System.out.println("   Обратно в StringBuilder: " + sb7);
        
        // 9. Сравнение производительности (демонстрация преимущества)
        System.out.println("\n=== Сравнение производительности ===");
        
        // Медленный способ: String (создаёт новые объекты)
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("String конкатенация: " + (endTime - startTime) / 1000000 + " мс");
        
        // Быстрый способ: StringBuilder
        startTime = System.nanoTime();
        StringBuilder sbFast = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sbFast.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder.append(): " + (endTime - startTime) / 1000000 + " мс");
        
        // 10. Преобразование через метод valueOf()
        System.out.println("\n=== Преобразование через valueOf() ===");
        StringBuilder sb10 = new StringBuilder("valueOf пример");
        String str10 = String.valueOf(sb10);
        System.out.println("String.valueOf(sb10): " + str10);
        
        StringBuffer sbf10 = new StringBuffer("StringBuffer пример");
        String str11 = String.valueOf(sbf10);
        System.out.println("String.valueOf(sbf10): " + str11);
    }
}
