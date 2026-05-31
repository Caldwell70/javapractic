/**
 * Перечисление с дополнительным методом.
 * 
 * Enum может содержать поля, конструкторы, методы.
 * Каждая константа может переопределять метод.
 */
public class EnumWithMethod {
    
    // Перечисление статусов заказа с методом getDescription()
    enum OrderStatus {
        NEW("Новый заказ", 0) {
            @Override
            public String getAction() {
                return "Подтвердите заказ";
            }
        },
        PAID("Оплачен", 1) {
            @Override
            public String getAction() {
                return "Передайте заказ в доставку";
            }
        },
        SHIPPED("Отправлен", 2) {
            @Override
            public String getAction() {
                return "Отслеживайте посылку";
            }
        },
        DELIVERED("Доставлен", 3) {
            @Override
            public String getAction() {
                return "Заказ выполнен";
            }
        };
        
        private final String description;
        private final int code;
        
        OrderStatus(String description, int code) {
            this.description = description;
            this.code = code;
        }
        
        public String getDescription() { return description; }
        public int getCode() { return code; }
        
        // Абстрактный метод
        public abstract String getAction();
        
        // Обычный метод
        public boolean isFinished() {
            return this == DELIVERED;
        }
    }
    
    public static void main(String[] args) {
        
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println("Статус: " + status);
            System.out.println("  Описание: " + status.getDescription());
            System.out.println("  Код: " + status.getCode());
            System.out.println("  Действие: " + status.getAction());
            System.out.println("  Завершён: " + status.isFinished());
            System.out.println();
        }
    }
}
