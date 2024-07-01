import java.util.Arrays;

public class Book {
    private String bookName;
    private int publishedYear;
    private Author[] author; //У книги может быть несколько авторов, поэтому создаем массив авторов

    public Book(String bookName, int publishedYear, Author... authors) {
        this.bookName = bookName;
        this.publishedYear = publishedYear;
        this.author = authors;
    }

    @Override
    // Делаем вывод метода в стандартном формате Java
    public String toString() {
        final StringBuilder bookInfo = new StringBuilder("Book{");
        bookInfo.append("bookName='").append(bookName).append('\'');
        bookInfo.append(", publishedYear=").append(publishedYear);
        bookInfo.append(", author=").append(Arrays.toString(author));
        bookInfo.append('}');
        return bookInfo.toString();
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
