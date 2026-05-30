/**
 * Демонстрация метода decode() класса Integer.
 * decode() преобразует строковое представление числа в Integer,
 * поддерживая разные системы счисления и форматы.
 */
public class Decode {
    public static void main(String[] args) {
        
        // decode() распознает различные форматы записи чисел:
        
        // 1. Десятичное число (обычная запись)
        Integer dec = Integer.decode("255");
        System.out.println("decode(\"255\") = " + dec);
        
        // 2. Шестнадцатеричное (начинается с 0x или 0X)
        Integer hex1 = Integer.decode("0xFF");
        Integer hex2 = Integer.decode("0XFF");
        System.out.println("decode(\"0xFF\") = " + hex1);
        System.out.println("decode(\"0XFF\") = " + hex2);
        
        // 3. Восьмеричное (начинается с 0)
        Integer oct = Integer.decode("0377");
        System.out.println("decode(\"0377\") = " + oct);
        
        // 4. С знаком (+/-)
        Integer pos = Integer.decode("+100");
        Integer neg = Integer.decode("-100");
        System.out.println("decode(\"+100\") = " + pos);
        System.out.println("decode(\"-100\") = " + neg);
        
        // 5. Шестнадцатеричные с минусом
        Integer negHex = Integer.decode("-0x10");
        System.out.println("decode(\"-0x10\") = " + negHex);       // -16
    }
}
