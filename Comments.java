/**
 * Пример:
 * Класс для представления пользователя системы.
 * Этот класс хранит основную информацию о пользователе:
 * имя, возраст и email.
 * 
 * @author Доржиева Арюна
 * @version 1.0
 * @since 2026-05-31
 */
public class Comments {
    private String name;
    private int age;
    private String email;
    
    /**
     * Конструктор для создания нового пользователя.
     * 
     * @param name  имя пользователя (не может быть null)
     * @param age   возраст пользователя (должен быть > 0)
     * @param email email пользователя
     * @throws IllegalArgumentException если age ≤ 0 или name пустой
     */
    public Comments(String name, int age, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст должен быть положительным");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    /**
     * Возвращает приветственное сообщение для пользователя.
     * Пример использования:
     * {@code String msg = user.getGreeting();}
     * 
     * @return строка с приветствием в формате "Привет, <name>!"
     */
    public String getGreeting() {
        return "Привет, " + name + "!";
    }
    
    /**
     * Проверяет, является ли пользователь совершеннолетним.
     * 
     * @return {@code true} если возраст ≥ 18, иначе {@code false}
     * @see #getAge()
     */
    public boolean isAdult() {
        return age >= 18;
    }
    
    /**
     * @return возраст пользователя
     */
    public int getAge() {
        return age;
    }
}
