/**
 * Класс Bank - внешний класс, содержащий различные внутренние классы.
 */
public class Bank {
    private String bankName = "Центральный Банк";
    private static String bankCode = "CB001";
    
    // 1. Private внутренний класс - только для использования внутри Bank
    private class TransactionValidator {
        private String validatorId = "VAL-001";
        
        public boolean validateTransaction(double amount) {
            System.out.println("  Валидация транзакции на сумму: " + amount);
            System.out.println("  Доступ к private полю bankName: " + bankName);
            return amount > 0 && amount < 1_000_000;
        }
    }
    
    // 2. Package-private внутренний класс - используется внутри пакета
    class AccountHelper {
        public String generateAccountNumber() {
            return "ACC-" + System.currentTimeMillis();
        }
    }
    
    // 3. Protected внутренний класс - доступен наследникам
    protected class InterestCalculator {
        protected double calculate(double amount, double rate) {
            return amount * rate / 100;
        }
    }
    
    // 4. Public внутренний класс - доступен всем
    public class Account {
        private String accountNumber;
        private double balance;
        
        public Account(double initialBalance) {
            this.accountNumber = new AccountHelper().generateAccountNumber();
            this.balance = initialBalance;
        }
        
        public void deposit(double amount) {
            TransactionValidator validator = new TransactionValidator();
            if (validator.validateTransaction(amount)) {
                balance += amount;
                System.out.println("  Внесено: " + amount + ", баланс: " + balance);
            } else {
                System.out.println("  Сумма не прошла валидацию");
            }
        }
        
        public void showInfo() {
            System.out.println("  Счёт: " + accountNumber + ", баланс: " + balance);
        }
    }
    
    // Метод внешнего класса, использующий private внутренний класс
    public void processTransaction(double amount) {
        System.out.println("\nBank.processTransaction(" + amount + ")");
        TransactionValidator validator = new TransactionValidator();
        if (validator.validateTransaction(amount)) {
            System.out.println("  Транзакция одобрена");
        } else {
            System.out.println("  Транзакция отклонена");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Демонстрация внутренних классов ===\n");
        
        // Создание внешнего класса
        Bank bank = new Bank();
        
        // 1. Использование private внутреннего класса (только через метод внешнего класса)
        System.out.println("1. Доступ к private внутреннему классу:");
        bank.processTransaction(500);
        bank.processTransaction(2_000_000);
        
        // 2. Использование package-private внутреннего класса
        System.out.println("\n2. Доступ к package-private внутреннему классу:");
        Bank.AccountHelper helper = bank.new AccountHelper();
        System.out.println("  Сгенерирован номер счёта: " + helper.generateAccountNumber());
        
        // 3. Использование public внутреннего класса
        System.out.println("\n3. Доступ к public внутреннему классу:");
        Bank.Account account = bank.new Account(1000);
        account.deposit(500);
        account.showInfo();
        
        // 4. Создание нескольких внутренних классов
        System.out.println("\n4. Создание нескольких объектов внутренних классов:");
        Bank.Account account1 = bank.new Account(5000);
        Bank.Account account2 = bank.new Account(10000);
        account1.showInfo();
        account2.showInfo();
    }
}
