/**
 * Собственное исключение для валидации возраста пользователя.
 * По договорённости имя класса заканчивается на Exception.
 */
public class InvalidAgeException extends Exception {
    
    /**
     * Конструктор 1: Без параметров.
     * Использует стандартное сообщение по умолчанию.
     */
    public InvalidAgeException() {
        super("Некорректный возраст пользователя");
    }
    
    /**
     * Конструктор 2: С пользовательским сообщением.
     * @param message детальное сообщение об ошибке
     */
    public InvalidAgeException(String message) {
        super(message);
    }
    
    /**
     * Конструктор 3: С сообщением и причиной (другим исключением).
     * @param message детальное сообщение об ошибке
     * @param cause исходное исключение-причина
     */
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
