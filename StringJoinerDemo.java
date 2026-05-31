import java.util.StringJoiner;

/**
 * Демонстрация работы класса StringJoiner.
 */
public class StringJoinerDemo {
    public static void main(String[] args) {
        
        // 1. Базовое использование: объединение с разделителем
        System.out.println("=== 1. Базовый StringJoiner ===");
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("яблоко");
        joiner1.add("груша");
        joiner1.add("банан");
        System.out.println(joiner1);  // "яблоко, груша, банан"
        
        // 2. С префиксом и суффиксом
        System.out.println("\n=== 2. С префиксом и суффиксом ===");
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("один");
        joiner2.add("два");
        joiner2.add("три");
        System.out.println(joiner2);  // "[один, два, три]"
        
        // 3. Объединение двух StringJoiner
        System.out.println("\n=== 3. Объединение StringJoiner ===");
        StringJoiner names = new StringJoiner(", ");
        names.add("Арюна");
        names.add("Булат");
        
        StringJoiner moreNames = new StringJoiner(", ");
        moreNames.add("Сэсэг");
        moreNames.add("Баир");
        
        names.merge(moreNames);
        System.out.println(names);  // "Арюна, Булат, Сэсэг, Баир"
        
        // 4. Пустой StringJoiner
        System.out.println("\n=== 4. Пустой StringJoiner ===");
        StringJoiner empty = new StringJoiner(", ");
        System.out.println("До добавления: '" + empty + "'");
        empty.add("первый");
        System.out.println("После добавления: '" + empty + "'");
        
        // 5. Значение по умолчанию для пустого StringJoiner
        System.out.println("\n=== 5. Значение по умолчанию ===");
        StringJoiner joiner3 = new StringJoiner(", ", "{", "}");
        System.out.println("Пустой: '" + joiner3 + "'");
        
        StringJoiner joiner4 = new StringJoiner(", ", "{", "}");
        joiner4.setEmptyValue("пусто");
        System.out.println("С установленным emptyValue: '" + joiner4 + "'");
        joiner4.add("элемент");
        System.out.println("После добавления: '" + joiner4 + "'");
        
        // 6. Реальный пример: формирование SQL запроса
        System.out.println("\n=== 6. Формирование SQL запроса ===");
        StringJoiner columns = new StringJoiner(", ");
        columns.add("id").add("name").add("age").add("email");
        
        StringJoiner values = new StringJoiner(", ", "(", ")");
        values.add("1").add("'Арюна'").add("20").add("'aryuna@mail.ru'");
        
        String sql = "INSERT INTO users (" + columns + ") VALUES " + values;
        System.out.println(sql);
        // INSERT INTO users (id, name, age, email) VALUES (1, 'Арюна', 25, 'aryuna@mail.ru')
        
        // 7. Работа со списком через StringJoiner
        System.out.println("\n=== 7. Создание CSV строки ===");
        String[] data = {"Иван", "Петр", "Мария", "Елена"};
        StringJoiner csv = new StringJoiner(";");
        for (String item : data) {
            csv.add(item);
        }
        System.out.println(csv);  // "Иван;Петр;Мария;Елена"
    }
}
