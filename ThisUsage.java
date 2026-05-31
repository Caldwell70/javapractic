/**
 * Использование this() для вызова конструкторов.
 * 
 * this() - вызывает другой конструктор того же класса
 * Должен быть первой строкой в конструкторе
 */
public class ThisUsage {
    
    static class A {
        int a;
        int b;
        int c;
        int z;
        
        // Базовый конструктор (устанавливает z = 1)
        public A() {
            this(0, 0, 0); // вызов конструктора с тремя параметрами
            z = 1;
        }
        
        public A(int a) {
            this(a, 0, 0);
        }
        
        public A(int a, int b) {
            this(a, b, 0);
        }
        
        public A(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            z = 1;
        }
        
        public void print() {
            System.out.printf("a=%d, b=%d, c=%d, z=%d%n", a, b, c, z);
        }
    }
    
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.print(); // a=0, b=0, c=0, z=1
        
        A obj2 = new A(10);
        obj2.print(); // a=10, b=0, c=0, z=1
        
        A obj3 = new A(10, 20);
        obj3.print(); // a=10, b=20, c=0, z=1
        
        A obj4 = new A(10, 20, 30);
        obj4.print(); // a=10, b=20, c=30, z=1
    }
}
