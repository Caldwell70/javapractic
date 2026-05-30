public class Overload {
    public static void main(String[] args) {
        String str = "Значение: ";
        int num = 42;
        double pi = 3.14159;
        boolean flag = true;
        
        System.out.println(str + num);
        System.out.println(str + pi);
        System.out.println(str + flag);

        System.out.println(100 + " рублей");

        System.out.println(10 + 20 + " = сумма");
        System.out.println("сумма = " + 10 + 20);
        System.out.println("сумма = " + (10 + 20));

        GetAge age = new GetAge(20);
        System.out.println("Сколько Вам лет? " + age);
    }
}

class GetAge {
    private int age;
    
    public GetAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Мне " + age + " лет";
    }
}
