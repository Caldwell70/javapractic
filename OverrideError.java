/**
 * Демонстрация того, как аннотация @Override помогает обнаружить ошибки.
 * 
 * Без @Override код скомпилируется, но будет работать неправильно.
 * С @Override компилятор сразу укажет на проблему.
 */
public class OverloadError {
    public static void main(String[] args) {
        
        System.out.println("Пример 1: Опечатка в имени метода\n");
        
        // Без @Override - код работает, но не так как ожидается
        Animal1 animal1 = new Cat1();
        animal1.makeSound();  // Ожидается "Мяу!", но выведет "Животное издает звук"
        System.out.println("Ожидается \"Мяу!\", но выведет \"Животное издает звук\"\n");
        
        System.out.println("\n(Остальные примеры закомментированы, так как не скомпилируются)\n");
    }
}

// Пример 1: Опечатка в имени метода (без @Override - ошибка скрыта)

class Animal1 {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Cat1 extends Animal1 {
    // Опечатка: makeSound → makeSond (пропущена буква 'u')
    // Нет @Override - компилятор не ругается, создаёт новый метод
    public void makeSond() {
        System.out.println("Кошка мяукает: Мяу!");
    }
}

// Исправленный вариант (раскомментировать, чтобы увидеть ошибку компиляции):
/*
class CatFixed1 extends Animal1 {
    @Override
    public void makeSond() {  // Ошибка: нет метода makeSond() в Animal1
        System.out.println("Кошка мяукает: Мяу!");
    }
}
*/

// Пример 2: Неправильная сигнатура (другие параметры)

class Animal2 {
    public void eat(String food) {
        System.out.println("Животное ест " + food);
    }
}

class Cat2 extends Animal2 {
    // Нет @Override - это перегрузка, а не переопределение
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
}

// Исправленный вариант:
/*
class CatFixed2 extends Animal2 {
    @Override
    public void eat() {  // Ошибка: сигнатура не совпадает (нет параметра String)
        System.out.println("Кошка ест рыбу");
    }
}
*/

// Пример 3: Неправильный тип параметров

class Calculator3 {
    public int add(int a, int b) {
        return a + b;
    }
}

class BetterCalculator3 extends Calculator3 {
    // Нет @Override - это перегрузка, параметры double вместо int
    public int add(double a, double b) {
        return (int)(a + b);
    }
}

// Исправленный вариант:
/*
class BetterCalculatorFixed3 extends Calculator3 {
    @Override
    public int add(double a, double b) {  // Ошибка: другие типы параметров
        return (int)(a + b);
    }
}
*/

// Пример 4: Несовместимый возвращаемый тип

class Animal4 {
    public Animal4 getParent() {
        return new Animal4();
    }
}

class Cat4 extends Animal4 {
    // Нет @Override - это новый метод
    public String getParent() {
        return "Мама-кошка";
    }
}

// Исправленный вариант:
/*
class CatFixed4 extends Animal4 {
    @Override
    public String getParent() {  // Ошибка: String не является подтипом Animal4
        return "Мама-кошка";
    }
}
*/

// Пример 5: Метод суперкласса переименован (рефакторинг)

class OldApi5 {
    // Было: public void fetchData()
    // Потом переименовали:
    public void loadData() {
        System.out.println("Загрузка данных");
    }
}

class MyService5 extends OldApi5 {
    // Нет @Override - метод fetchData() стал просто новым методом
    public void fetchData() {
        System.out.println("Моя загрузка данных");
    }
}

// Исправленный вариант:
/*
class MyServiceFixed5 extends OldApi5 {
    @Override
    public void fetchData() {  // Ошибка: в OldApi5 больше нет fetchData()
        System.out.println("Моя загрузка данных");
    }
}
*/

// Пример 6: Более строгий модификатор доступа

class Parent6 {
    public void publicMethod() {
        System.out.println("Public метод");
    }
}

class Child6 extends Parent6 {
    // Нет @Override - код скомпилируется, но это не переопределение
    private void publicMethod() {
        System.out.println("Private метод");
    }
}

// Исправленный вариант:
/*
class ChildFixed6 extends Parent6 {
    @Override
    private void publicMethod() {  // Ошибка: нельзя сужать доступ (public → private)
        System.out.println("Private метод");
    }
}
*/

// Правильный пример (как должно быть)

class AnimalCorrect {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class CatCorrect extends AnimalCorrect {
    @Override  // Правильно: сигнатура совпадает, компилятор доволен
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу!");
    }
}
