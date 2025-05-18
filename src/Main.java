import Cars.Car;
import Humans.Human;

/**
 * Главный класс с методом main, демонстрирующий работу классов Human и Car.
 * Выполняет домашние задания 1–3.
 */
public class Main {

    /**
     * Главный метод программы. Запускает выполнение заданий.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("OOP - Object");
        task1_2();  // Задание 1 и 2
        task3();    // Задание 3
    }

    /**
     * Выполнение домашнего задания №3.
     * Демонстрирует работу с конструкторами классов Human и Car с проверками и дефолтными значениями.
     */
    private static void task3() {
        System.out.println("Домашнее задание 3");

        // Создание объектов Human с разными конструкторами
        Human maxim = new Human(); // Все данные по умолчанию
        System.out.println(maxim);

        Human anya = new Human(1993); // Только год рождения
        System.out.println(anya);

        Human katya = new Human("Катя", -1992, "Калининград"); // Неверный год рождения (отрицательный)
        System.out.println(katya);

        separator();

        // Создание объектов Car с разными конструкторами
        Car lada = new Car(1.7, "желтый", 2015); // Упрощённый конструктор
        System.out.println(lada);

        Car audi = new Car("Audi", "A8", 3.0, 2020, "Германия"); // Конструктор без цвета
        System.out.println(audi);

        Car bmw = new Car("BMW", "Z8", -3, "черный", 2021, "Германия"); // Неверный объём двигателя
        System.out.println(bmw);

        Car kia = new Car("Kia", "Sportage 4-го покаления", 2.4, "красный", 0, "Южная Корея"); // Год выпуска 0
        System.out.println(kia);
    }

    /**
     * Выполнение домашнего задания №1 и №2.
     * Демонстрирует использование полной информации при создании объектов.
     */
    private static void task1_2() {
        System.out.println("Домашнее задание 1 - 2");
        separator();

        // Создание объектов Human с полной информацией
        Human maxim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        // Вывод информации о людях
        System.out.printf(maxim + "\n" + anya + "\n" + katya + "\n" + artem + "\n");

        separator();

        // Создание объектов Car с полной информацией
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го покаления", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        // Вывод информации о машинах
        System.out.printf(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai + "\n");

        separator();
    }

    /**
     * Выводит визуальный разделитель в консоль для читаемости.
     */
    private static void separator() {
        System.out.println("=========================================================================================");
    }
}
