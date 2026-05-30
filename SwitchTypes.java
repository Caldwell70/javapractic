/**
 * Типы переменных в конструкции switch.
 */
public class SwitchTypes {
    
    enum Day { MONDAY, TUESDAY, WEDNESDAY }
    
    public static void main(String[] args) {
        
        // 1. byte
        byte b = 2;
        switch(b) {
            case 1: System.out.println("byte: 1"); break;
            case 2: System.out.println("byte: 2"); break;
            default: System.out.println("byte: другое");
        }
        
        // 2. short
        short s = 3;
        switch(s) {
            case 1: System.out.println("short: 1"); break;
            case 2: System.out.println("short: 2"); break;
            default: System.out.println("short: другое");
        }
        
        // 3. int
        int i = 1;
        switch(i) {
            case 1: System.out.println("int: 1"); break;
            case 2: System.out.println("int: 2"); break;
            default: System.out.println("int: другое");
        }
        
        // 4. char
        char c = 'B';
        switch(c) {
            case 'A': System.out.println("char: A"); break;
            case 'B': System.out.println("char: B"); break;
            default: System.out.println("char: другое");
        }
        
        // 5. String
        String str = "привет";
        switch(str) {
            case "привет": System.out.println("String: привет"); break;
            case "пока": System.out.println("String: пока"); break;
            default: System.out.println("String: другое");
        }
        
        // 6. enum
        Day day = Day.MONDAY;
        switch(day) {
            case MONDAY: System.out.println("enum: Понедельник"); break;
            case TUESDAY: System.out.println("enum: Вторник"); break;
            default: System.out.println("enum: Другой день");
        }
    }
}
