package Cars;

/**
 * Класс, представляющий автомобиль с основными характеристиками.
 */
public class Car {

    // Поля (свойства) автомобиля
    private String brand;           // Марка автомобиля
    private String model;           // Модель автомобиля
    private double engineVolume;    // Объем двигателя в литрах
    private String color;           // Цвет кузова
    private int year;               // Год выпуска
    private String country;         // Страна производства

    /**
     * Конструктор с минимальным количеством параметров.
     * Устанавливает значения по умолчанию для марки, модели и страны.
     *
     * @param engineVolume Объем двигателя
     * @param color Цвет кузова
     * @param year Год выпуска
     */
    public Car(double engineVolume, String color, int year) {
        this("default", "default", engineVolume, color, year, "default");
    }

    /**
     * Конструктор без указания цвета. Цвет устанавливается по умолчанию: "белый".
     *
     * @param brand Марка автомобиля
     * @param model Модель автомобиля
     * @param engineVolume Объем двигателя
     * @param year Год выпуска
     * @param country Страна сборки
     */
    public Car(String brand, String model, double engineVolume, int year, String country) {
        this(brand, model, engineVolume, "белый", year, country);
    }

    /**
     * Основной конструктор, содержащий всю необходимую информацию об автомобиле.
     * Здесь также происходят проверки на корректность введенных данных.
     *
     * @param brand Марка автомобиля
     * @param model Модель автомобиля
     * @param engineVolume Объем двигателя
     * @param color Цвет кузова
     * @param year Год выпуска
     * @param country Страна сборки
     */
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        // Проверка: если передана пустая строка или null, ставим "default"
        this.brand = (brand == null || brand.isBlank()) ? "default" : brand;
        this.model = (model == null || model.isBlank()) ? "default" : model;
        this.country = (country == null || country.isBlank()) ? "default" : country;

        // Если объем двигателя не задан или ≤ 0, устанавливаем 1.5 л
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;

        // Если цвет не задан — используем белый
        this.color = (color == null || color.isBlank()) ? "белый" : color;

        // Если год выпуска неадекватный — ставим 2000
        this.year = (year <= 0) ? 2000 : year;
    }

    /**
     * Метод toString для красивого вывода информации об автомобиле.
     *
     * @return Строка с описанием автомобиля
     */
    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, производство %s, цвет %s, объем двигателя %.1f л",
                brand, model, year, country, color, engineVolume);
    }
}
