public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Целые типы");
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;

        int r1 = b + s;
        System.out.println("byte(" + b + ") + short(" + s + ") = int(" + r1 + ")");

        int r2 = s + i;
        System.out.println("short(" + s + ") + int(" + i + ") = int(" + r2 + ")");

        long r3 = i + l;
        System.out.println("int(" + i + ") + long(" + l + ") = long(" + r3 + ")");

        System.out.println("\nПлавающая точка");
        float f = 3.14f;
        double d = 2.718;

        double r4 = f + d;
        System.out.println("float(" + f + ") + double(" + d + ") = double(" + r4 + ")");

        float r5 = i + f;
        System.out.println("int(" + i + ") + float(" + f + ") = float(" + r5 + ")");

        System.out.println("\nПояснение: Результат операции имеет тип, который является наибольшим среди типов операндов согласно цепочке: byte -> short -> int -> long -> float -> double. Но byte, short, char повышаются до int");
    }
}
