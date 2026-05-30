/**
 * Примеры методов класса java.util.Arrays.
 * 
 * Класс Arrays содержит статические методы для работы с массивами:
 * - toString() - преобразование в строку
 * - binarySearch() - бинарный поиск (массив должен быть отсортирован)
 * - equals() - сравнение массивов
 * - compare() - лексикографическое сравнение
 * - sort() - сортировка массива
 */
import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        
        // 1. toString() - преобразует массив в читаемую строку
        int[] numbers = {5, 2, 8, 1, 9};
        System.out.println("Массив numbers: " + Arrays.toString(numbers));
        // Вывод: Массив numbers: [5, 2, 8, 1, 9]

        // 2. binarySearch() - бинарный поиск (массив должен быть отсортирован)
        int[] sorted = {10, 20, 30, 40, 50};
        int index = Arrays.binarySearch(sorted, 30);
        System.out.println("Индекс элемента 30: " + index);

        // 3. equals() - сравнение массивов
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2)); // true
        System.out.println("Arrays.equals(arr1, arr3): " + Arrays.equals(arr1, arr3)); // false
        
        // 4. compare() - лексикографическое сравнение
        int[] comp1 = {1, 2, 3};
        int[] comp2 = {1, 2, 3};
        int[] comp3 = {1, 2, 4};
        int[] comp4 = {1, 2};
        
        System.out.println("comp1 vs comp2: " + Arrays.compare(comp1, comp2)); // 0 (равны)
        System.out.println("comp1 vs comp3: " + Arrays.compare(comp1, comp3)); // -1 (comp1 < comp3)
        System.out.println("comp3 vs comp1: " + Arrays.compare(comp3, comp1)); // 1 (comp3 > comp1)
        System.out.println("comp1 vs comp4: " + Arrays.compare(comp1, comp4)); // 1 (разная длина)

        // 5. sort() - сортировка массива
        int[] unsorted = {5, 2, 8, 1, 9, 3};
        System.out.println("До сортировки: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);
        System.out.println("После сортировки: " + Arrays.toString(unsorted));
        // Вывод: После сортировки: [1, 2, 3, 5, 8, 9]
    }
}
