import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        
        System.out.println("Привет, " + name);
        
        scan.close();
    }
}
