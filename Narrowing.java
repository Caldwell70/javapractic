public class Narrowing {
    public static void main(String[] args) {
        System.out.println("1. double -> int (потеря дробной части)");
        double temperature = 36.6;
        int tempInt = (int) temperature;
        System.out.println("double: " + temperature + " -> int: " + tempInt);
        
        double negative = -3.14;
        int negInt = (int) negative;
        System.out.println("double: " + negative + " -> int: " + negInt);
        
        System.out.println("\n2. long -> int (переполнение)");
        long maxLong = 2147483648L;
        int fromLong = (int) maxLong;
        System.out.println("long: " + maxLong + " -> int: " + fromLong);
        
        long normalLong = 123456;
        int normalInt = (int) normalLong;
        System.out.println("long: " + normalLong + " -> int: " + normalInt);
        
        System.out.println("\n3. int -> byte (потеря старших битов)");
        int bigInt = 300;
        byte smallByte = (byte) bigInt;
        System.out.println("int: " + bigInt + " -> byte: " + smallByte);
        
        System.out.println("\n4. int -> short (переполнение)");
        int largeInt = 40000;
        short shortVal = (short) largeInt;
        System.out.println("int: " + largeInt + " -> short: " + shortVal);
        
        System.out.println("\n5. double -> float (потеря точности)");
        double pi = Math.PI;
        float piFloat = (float) pi;
        System.out.println("double pi: " + pi);
        System.out.println("float pi:  " + piFloat);
        System.out.println("Разница: " + (pi - piFloat));
        
        System.out.println("\n6. char -> int (расширяющее, безопасное)");
        char ch = 'Z';
        int code = ch;
        System.out.println("char: " + ch + " -> int: " + code);
        
        System.out.println("\n7. int -> char (сужающее, но возможно)");
        int codePoint = 65;
        char symbol = (char) codePoint;
        System.out.println("int: " + codePoint + " -> char: " + symbol);
        
        System.out.println("\n8. float -> int (потеря дробной части)");
        float f = 3.99f;
        int i = (int) f;
        System.out.println("float: " + f + " -> int: " + i);
    }
}
