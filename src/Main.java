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

    }
}