import java.util.ArrayList; // Импортируем класс ArrayList из пакета java.util для работы с динамическими массивами.
import java.util.Collections; // Импортируем класс Collections для использования утилитарных методов для работы с коллекциями.

class StringArray { // Определяем класс StringArray, который будет управлять списком строк.
    private ArrayList<String> strings; // Объявляем приватное поле strings типа ArrayList, которое будет хранить строки.

    public StringArray() { // Конструктор класса, который вызывается при создании объекта StringArray.
        strings = new ArrayList<>(); // Инициализируем поле strings как новый пустой ArrayList.
    }

    public void addString(String str) { // Метод для добавления строки в список.
        strings.add(str); // Добавляем переданную строку в список strings.
        // Сортируем список strings по длине строк после добавления новой строки.
        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public String getMaxLengthString() { // Метод для получения строки максимальной длины из списка.
        if (strings.isEmpty()) { // Проверяем, пуст ли список strings.
            return null; // Если список пустой, возвращаем null.
        }
        // Используем метод max из класса Collections для нахождения строки с максимальной длиной.
        return Collections.max(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public double getAverageLength() { // Метод для вычисления средней длины строк в списке.
        if (strings.isEmpty()) { // Проверяем, пуст ли список strings.
            return 0; // Если список пустой, возвращаем 0.
        }
        // Используем стримы для вычисления общей длины всех строк в списке.
        int totalLength = strings.stream().mapToInt(String::length).sum();
        // Вычисляем среднюю длину, деля общую длину на количество строк.
        return (double) totalLength / strings.size();
    }
}
