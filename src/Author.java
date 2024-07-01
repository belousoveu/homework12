public class Author {
    private String firstName;
    private String lastName;
    private String middleName;

    public Author(String FirstName, String LastName, String MiddleName) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.middleName = MiddleName;

    }

    public Author(String FirstName, String LastName) {
        this(FirstName, LastName, "");
    }

    @Override
    // Делаем вывод метода в визуально удобном представлении
    public String toString() {
        final StringBuilder fullName = new StringBuilder(firstName);
        fullName.append(" ").append(middleName);
        fullName.append(" ").append(lastName);
        return fullName.toString().replace("  ", " ");
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
