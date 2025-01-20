import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //// класс страна
        Country country = new Country("Україна", "Європа", 40000000, "+380", "Одеса:)", Arrays.asList("Львів", "Київ", "Харків"));
        country.displayInfo();

        //// класс книга
        Book book = new Book("Тарас Бульба", "Микола Гоголь", 1835, "Київська друкарня", "Роман", 300);
        book.displayInfo();

        ///// класс бэтмобиль
        Car car = new Car("Batmanbatman", "Batman", 2025, 999.0);
        car.displayInfo();
    }
}

class Country {
    private String name;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    public Country(String name, String continent, int population, String phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = new ArrayList<>(cities);
    }

    public void displayInfo() {
        System.out.println("Країна: " + name);
        System.out.println("Континент: " + continent);
        System.out.println("Населення: " + population);
        System.out.println("Телефонний код: " + phoneCode);
        System.out.println("Столиця: " + capital);
        System.out.println("Міста: " + String.join(", ", cities));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;

    public Book(String title, String author, int year, String publisher, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Назва книги: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік випуску: " + year);
        System.out.println("Видавництво: " + publisher);
        System.out.println("Жанр: " + genre);
        System.out.println("Кількість сторінок: " + pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Car {
    private String name;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void displayInfo() {
        System.out.println("Назва автомобіля: " + name);
        System.out.println("Виробник: " + manufacturer);
        System.out.println("Рік випуску: " + year);
        System.out.println("Об'єм двигуна: " + engineVolume + " л");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
