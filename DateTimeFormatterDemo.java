import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Демонстрация использования пяти спецификаторов форматирования даты и времени.
 */
public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        
        // Создаём объект с текущей датой и временем
        Calendar calendar = new GregorianCalendar(2026, 4, 31, 14, 30, 45);
        calendar.set(Calendar.MILLISECOND, 567);
        Date date = calendar.getTime();
        
        System.out.println("=== Демонстрация спецификаторов даты и времени ===\n");
        System.out.println("Исходная дата: " + date);
        System.out.println();
        
        // 1. %tH - час в 24-часовом формате (00–23)
        System.out.println("1. %tH - час (00 - 23):");
        String hour24 = String.format("%tH", date);
        System.out.println("   Час: " + hour24);
        
        // 2. %tM - минуты (00–59)
        System.out.println("\n2. %tM - минуты:");
        String minutes = String.format("%tM", date);
        System.out.println("   Минуты: " + minutes);
        
        // 3. %tY - год в четырёхзначном формате
        System.out.println("\n3. %tY - год (4 цифры):");
        String year = String.format("%tY", date);
        System.out.println("   Год: " + year);
        
        // 4. %tB - полное название месяца
        System.out.println("\n4. %tB - полное название месяца:");
        String month = String.format("%tB", date);
        System.out.println("   Месяц: " + month);
        
        // 5. %tA - полное название дня недели
        System.out.println("\n5. %tA - полное название дня недели:");
        String weekDay = String.format("%tA", date);
        System.out.println("   День недели: " + weekDay);
    }
}
