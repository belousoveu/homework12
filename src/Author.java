import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;
    private final String middleName;

    public Author(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;

    }

    public Author(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    @Override
    // Делаем вывод метода в визуально удобном представлении
    public String toString() {
        final StringBuilder fullName = new StringBuilder(firstName);
        fullName.append(" ").append(middleName);
        fullName.append(" ").append(lastName);
        return fullName.toString().replace("  ", " ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName)
                && Objects.equals(lastName, author.lastName)
                && Objects.equals(middleName, author.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
