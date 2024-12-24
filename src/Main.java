public class Main { // Объявляем класс Main, который будет содержать метод main.
    public static void main(String[] args) { // Объявляем статический метод main, который является точкой входа в программу.
        StringArray manager = new StringArray(); // Создаем новый объект manager класса StringArray.
        // Добавляем строки в объект manager с помощью метода addString.
        manager.addString("Hello"); // Добавляем строку "Hello" в список.
        manager.addString("World"); // Добавляем строку "World" в список.
        manager.addString("Java"); // Добавляем строку "Java" в список.
        manager.addString("Programming"); // Добавляем строку "Programming" в список.

        // Выводим на консоль строку максимальной длины, полученную с помощью метода getMaxLengthString.
        System.out.println("Max length string: " + manager.getMaxLengthString()); // Вывод: Programming
        // Выводим на консоль среднюю длину строк, полученную с помощью метода getAverageLength.
        System.out.println("Average length: " + manager.getAverageLength()); // Вывод: 5.75
    }
}
