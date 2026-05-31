import java.util.ArrayList;
import java.util.List;

/**
 * Использование wildcard с extends и super.
 * 
 * <? extends T> - "неизвестный тип, являющийся подтипом T"
 * (можно читать, нельзя писать)
 * 
 * <? super T> - "неизвестный тип, являющийся супертипом T"
 * (можно писать, читать как Object)
 * 
 * Нужны для гибкости при работе с наследниками,
 * ограничения на чтение/запись.
 */
public class ExtendsSuper {
    
    public static void main(String[] args) {
        
        // Базовые классы для демонстрации
        class Animal { String name = "Животное"; }
        class Dog extends Animal { String bark = "Гав!"; }
        class Puppy extends Dog { String play = "Играю"; }
        
        // Создаем списки разных типов
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        
        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy());
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());
        
        List<? extends Dog> extendsDog = dogs; // можно присвоить List<Dog>
        extendsDog = puppies; // можно присвоить List<Puppy> (подтип)
        // extendsDog = animals; - ошибка, Animal не является подтипом Dog
        // extendsDog = objects; - ошибка
        
        // Чтение: гарантированно получаем Dog или его подтип
        Dog dog = extendsDog.get(0);
        
        // Запись: нельзя добавлять элементы
        // extendsDog.add(new Dog()); - ошибка
        // extendsDog.add(new Puppy()); - ошибка
        
        List<? super Dog> superDog = dogs; // можно присвоить List<Dog>
        superDog = animals; // можно присвоить List<Animal>
        superDog = objects; // можно присвоить List<Object>
        // superDog = puppies; - ошибка, Puppy не является супертипом Dog
        
        // Запись: можно добавлять Dog и его подтипы
        superDog.add(new Dog());
        superDog.add(new Puppy());
        
        // Чтение: нельзя получить конкретный тип
        // Dog d = superDog.get(0); - онибка
        Object obj = superDog.get(0);
    }
    
    // Метод, который только читает из списка (используем extends)
    // Может принимать List<Animal> и List<ЛюбойПодтипAnimal>
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println("  " + a.name);
        }
    }
    
    // Метод, который только добавляет в список (используем super)
    // Может принимать List<Animal> и List<ЛюбойСупертипDog>
    public static void addDogToCollection(List<? super Dog> list) {
        list.add(new Dog());
        System.out.println("  Dog добавлен в коллекцию");
    }
}
