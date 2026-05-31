/**
 * Конфликт default методов в нескольких интерфейсах
 * 
 * Если класс реализует два интерфейса с одинаковыми 
 * default методами, возникает конфликт имён. 
 * Компилятор выдаст ошибку, требуя явно указать, 
 * какой метод использовать.
 * 
 * Пример разрешения конфликта default методов
 */
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.call();
        phone.camera();
        phone.media();
    }
}

interface Phone {
    default void call() {
        System.out.println("Звонок через сотовую сеть");
    }
}

interface Camera {
    default void camera() {
        System.out.println("Фотосъёмка");
    }
}

interface MediaPlayer {
    default void media() {
        System.out.println("Воспроизведение музыки");
    }
}

// Конфликт: два интерфейса с одинаковым методом
interface Recorder {
    default void record() {
        System.out.println("Запись звука");
    }
}

interface VideoRecorder {
    default void record() {
        System.out.println("Запись видео");
    }
}

// Разрешение конфликта
class Smartphone implements Phone, Camera, MediaPlayer, Recorder, VideoRecorder {
    
    // Конфликт record() - должны переопределить
    @Override
    public void record() {
        Recorder.super.record();      // запись звука
        VideoRecorder.super.record(); // запись видео
        System.out.println("Смартфон записывает в формате MP4");
    }
}
