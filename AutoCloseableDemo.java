import java.io.*;

/**
 * Интерфейс AutoCloseable обеспечивает автоматическое освобождение ресурсов 
 * (закрытие файлов, сетевых соединений, соединений с БД) с помощью конструкции try-with-resources.
 * 
 * Демонстрация необходимости AutoCloseable и try-with-resources.
 */
public class AutoCloseableDemo {
    
    public static void main(String[] args) {
        
        System.out.println("=== Без AutoCloseable (старый способ) ===\n");
        oldWay();
        
        System.out.println("\n=== С AutoCloseable (try-with-resources) ===\n");
        tryWithResources();
        
        System.out.println("\n=== Создание собственного AutoCloseable ресурса ===\n");
        customResourceDemo();
    }
    
    /**
     * Старый способ: ручное закрытие в finally.
     * Много шаблонного кода, легко забыть close().
     */
    public static void oldWay() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");
            int data = fis.read();
            System.out.println("Прочитано: " + data);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            // Обязательно нужно закрыть в finally
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии: " + e.getMessage());
                }
            }
        }
    }
    
    /**
     * Новый способ: try-with-resources (AutoCloseable).
     * Код чище, ресурсы закрываются автоматически.
     */
    public static void tryWithResources() {
        // Ресурсы автоматически закроются после try блока
        try (FileInputStream fis = new FileInputStream("test.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            
            int data = bis.read();
            System.out.println("Прочитано: " + data);
            
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // fis и bis автоматически закрыты здесь
    }
    
    /**
     * Собственный ресурс, реализующий AutoCloseable.
     */
    static class DatabaseConnection implements AutoCloseable {
        private String connectionName;
        
        public DatabaseConnection(String name) {
            this.connectionName = name;
            System.out.println("   Открыто соединение: " + name);
        }
        
        public void query(String sql) {
            System.out.println("   Выполнение запроса: " + sql);
        }
        
        @Override
        public void close() {
            System.out.println("   Закрыто соединение: " + connectionName);
        }
    }
    
    /**
     * Демонстрация собственного AutoCloseable ресурса.
     */
    public static void customResourceDemo() {
        // Ресурс автоматически закроется
        try (DatabaseConnection conn = new DatabaseConnection("MySQL DB")) {
            conn.query("SELECT * FROM users");
            conn.query("UPDATE users SET name = 'Арюна'");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // conn.close() вызван автоматически
        
        // Несколько ресурсов
        System.out.println("\n   Несколько ресурсов:");
        try (DatabaseConnection conn1 = new DatabaseConnection("Primary DB");
             DatabaseConnection conn2 = new DatabaseConnection("Secondary DB")) {
            
            conn1.query("INSERT INTO logs VALUES ('action')");
            conn2.query("SELECT * FROM backups");
            
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        // conn2 закрыт, затем conn1 закрыт (обратный порядок)
    }
}
