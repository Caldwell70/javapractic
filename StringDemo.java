/**
 * Демонстрация методов StringBuilder и StringBuffer.
 * 
 * StringBuilder и StringBuffer имеют одинаковые методы,
 * но StringBuffer потокобезопасен (синхронизирован),
 * а StringBuilder быстрее (не синхронизирован).
 */
public class StringDemo {
    public static void main(String[] args) {
        
        // Создание объектов
        StringBuilder sb = new StringBuilder("Строка");
        StringBuffer sbf = new StringBuffer("Буфер");
        
        System.out.println("=== Демонстрация методов StringBuilder ===\n");
        
        // 1. append() - добавляет строку в конец
        System.out.println("1. append():");
        sb.append(" для");
        sb.append(" демонстрации");
        System.out.println("   Результат: " + sb);  // "Строка для демонстрации"
        
        // 2. insert() - вставляет строку в указанную позицию
        System.out.println("\n2. insert():");
        sb.insert(7, " (вставка) ");
        System.out.println("   Результат: " + sb);  // "Строка (вставка) для демонстрации"
        
        // 3. delete() - удаляет символы с start до end
        System.out.println("\n3. delete():");
        sb.delete(7, 18);  // удаляем " (вставка) "
        System.out.println("   Результат: " + sb);  // "Строка для демонстрации"
        
        // 4. deleteCharAt() - удаляет символ по индексу
        System.out.println("\n4. deleteCharAt():");
        sb.deleteCharAt(7);  // удаляем пробел после "Строка"
        System.out.println("   Результат: " + sb);  // "Строкадля демонстрации"
        
        // 5. replace() - заменяет часть строки
        System.out.println("\n5. replace():");
        sb.replace(6, 9, " для ");  // заменяем "для" на " для "
        System.out.println("   Результат: " + sb);  // "Строка для демонстрации"
        
        // 6. reverse() - переворачивает строку
        System.out.println("\n6. reverse():");
        StringBuilder reversed = new StringBuilder("Java").reverse();
        System.out.println("   'Java' -> " + reversed);  // "avaJ"
        
        // 7. length() - возвращает длину строки
        System.out.println("\n7. length():");
        System.out.println("   Длина строки '" + sb + "' = " + sb.length());
        
        // 8. charAt() - возвращает символ по индексу
        System.out.println("\n8. charAt():");
        System.out.println("   Символ на позиции 0: '" + sb.charAt(0) + "'");
        System.out.println("   Символ на позиции 5: '" + sb.charAt(5) + "'");
        
        // 9. substring() - возвращает часть строки как String
        System.out.println("\n9. substring():");
        String part = sb.substring(7, 10);
        System.out.println("   sb.substring(7, 10) = '" + part + "'");  // "для"
        
        // 10. setCharAt() - заменяет символ в указанной позиции
        System.out.println("\n10. setCharAt():");
        sb.setCharAt(0, 'с');
        System.out.println("   Замена первого символа: " + sb);  // "строка для демонстрации"
    }
}
