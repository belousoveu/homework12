import java.util.Arrays;
import java.util.Objects;

public class Book {
    private final String bookName;
    private int publishedYear;
    private final Author[] author; //У книги может быть несколько авторов, поэтому создаем массив авторов

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear
                && Objects.equals(bookName, book.bookName)
                && Objects.deepEquals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishedYear, Arrays.hashCode(author));
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
