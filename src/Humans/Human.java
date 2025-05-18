package Humans;

/**
 * Класс представляет человека с базовой информацией:
 * имя, год рождения, город и должность.
 */
public class Human {
    /** Год рождения */
    int yearOfBirth;
    
    /** Имя */
    String name;
    
    /** Город проживания */
    String town;
    
    /** Название должности */
    String jobTitle;

    /**
     * Конструктор по умолчанию.
     * Устанавливает все поля в значение "Информация не указана", кроме года рождения — он будет 0.
     */
    public Human() {
        this("Информация не указана", 0, "Информация не указана", "Информация не указана");
    }

    /**
     * Конструктор с указанием только года рождения.
     * Остальные поля устанавливаются как "Информация не указана".
     *
     * @param yearOfBirth год рождения
     */
    public Human(int yearOfBirth) {
        this("Информация не указана", yearOfBirth, "Информация не указана", "Информация не указана");
    }

    /**
     * Конструктор с указанием имени, года рождения и города.
     * Должность будет установлена как "Информация не указана".
     *
     * @param name имя
     * @param yearOfBirth год рождения
     * @param town город проживания
     */
    public Human(String name, int yearOfBirth, String town) {
        this(name, yearOfBirth, town, "Информация не указана");
    }

    /**
     * Основной конструктор, который инициализирует все поля.
     * Проверяет валидность года рождения (должен быть 0 или больше).
     *
     * @param name имя
     * @param yearOfBirth год рождения
     * @param town город проживания
     * @param jobTitle должность
     */
    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;

        // Проверка: если год отрицательный, ставим 0 по умолчанию
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            // Альтернатива: выбрасывать исключение
            // throw new RuntimeException("Год рождения не может быть отрицательным!");
            this.yearOfBirth = 0;
        }

        this.town = town;
        this.jobTitle = jobTitle;
    }

    /**
     * Переопределённый метод toString.
     * Возвращает красиво оформленную строку с данными человека.
     *
     * @return строка с описанием объекта
     */
    @Override
    public String toString() {
        return String.format(
            "Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",
            name, town, yearOfBirth, jobTitle
        );
    }
}