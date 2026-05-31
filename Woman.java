/**
 * Класс Person с корректно переопределённым equals().
 */
public class Woman {
    private String firstName;
    private String lastName;
    private int age;
    
    public Woman(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Рефлексивность: проверка на тот же объект
        if (this == obj) {
            return true;
        }
        
        // 2. Проверка на null
        if (obj == null) {
            return false;
        }
        
        // 3. Проверка типа (не getClass() для возможности наследования)
        if (!(obj instanceof Woman)) {
            return false;
        }
        
        // 4. Приведение типа
        Woman other = (Woman) obj;
        
        // 5. Сравнение значимых полей
        return age == other.age &&
               firstName.equals(other.firstName) &&
               lastName.equals(other.lastName);
    }
    
    // hashCode всегда переопределяется вместе с equals
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + " лет";
    }
    
    public static void main(String[] args) {
        Woman p1 = new Woman("Арюна", "Доржиева", 20);
        Woman p2 = new Woman("Диана", "Ахметшина", 24);
        Woman p3 = new Woman("Полина", "Сахарова", 19);
        
        System.out.println("Рефлексивность: " + p1.equals(p1));           // true
        System.out.println("Симметричность: " + p1.equals(p2) + " = " + p2.equals(p1)); // true = true
        System.out.println("Сравнение с null: " + p1.equals(null));       // false
        System.out.println("Равные объекты: " + p1.equals(p2));           // true
        System.out.println("Разные объекты: " + p1.equals(p3));           // false
        System.out.println("hashCode равных: " + p1.hashCode() + " = " + p2.hashCode()); // одинаковые
    }
}
