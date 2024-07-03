import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Создам объекты Author.
        //Используем конструктор с двумя параметрами
        Author eckel = new Author("Брюс", "Эккель");

        //Используем конструктор с тремя параметрами
        Author martin = new Author("Роберт", "Мартин", "С.");
        Author heineman = new Author("Джордж", "Хайнеман");
        Author pollice = new Author("Гэри", "Поллис");
        Author selkow = new Author("Стэнли", "Селков");

        //Выборочно проверяем что поля объектов заполненны корректно
        //вывод в консоль через переопределенный метод toString()
        System.out.println("eckel.toString() = " + eckel);
        System.out.println("martin.toString() = " + martin);

        Book thinkingInJava = new Book("Философия Java",
                2015, eckel);
        Book cleanCode = new Book("Чистый код: создание, анализ и рефакторинг",
                2018, martin);
        Book algorithmsInANutshell = new Book("Алгоритмы. Справочник с примерами на C,C++,Java и Python",
                2017, heineman, pollice, selkow);
        Book cleanArchitecture = new Book("Чистая архитектура. Искусство разработки программного обеспечения",
                2018, martin);


        //Выводим в консоль объект Book через переопределенный метод toString()
        //до изменения поля PublishedYear
        System.out.println("До изменения даты выпуска книги:");
        System.out.println("algorithmsInANutshell.toString() = " + algorithmsInANutshell);
        System.out.println("cleanCode.toString() = " + cleanCode);

        algorithmsInANutshell.setPublishedYear(2020);
        cleanCode.setPublishedYear(2019);

        // после изменения поля PublishedYear

        System.out.println("После изменения даты выпуска книги:");
        System.out.println("algorithmsInANutshell.toString() = " + algorithmsInANutshell);
        System.out.println("cleanCode.toString() = " + cleanCode);

        // Сравниваем книги через метод equals()
        System.out.println("cleanArchitecture.equals(cleanCode) = " + cleanArchitecture.equals(cleanCode));

        //Сравниваем авторов книг. Поскольку авторы у нас в виде массива, то используем метод Arrays.equals()
        System.out.println("cleanArchitecture.getAuthor().equals(cleanCode.getAuthor()) = " + Arrays.equals(cleanArchitecture.getAuthor(), cleanCode.getAuthor()));
        System.out.println("cleanCode.getAuthor().equals(thinkingInJava.getAuthor()) = " + Arrays.equals(cleanCode.getAuthor(), thinkingInJava.getAuthor()));

        //Сравниваем объекты Author
        System.out.println("martin.equals(heineman) = " + martin.equals(heineman));

        // Выводим hashCode() книг и сравниваем их.
        System.out.println("cleanArchitecture.hashCode() = " + cleanArchitecture.hashCode());
        System.out.println("cleanCode.hashCode() =  " + cleanCode.hashCode());
        System.out.println("cleanArchitecture.hashCode()== cleanCode.hashCode() = " + (cleanArchitecture.hashCode() == cleanCode.hashCode()));


    }
}