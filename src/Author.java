public class Author {
    private String FirstName;
    private String LastName;
    private String MiddleName;

    public Author(String FirstName, String LastName, String MiddleName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MiddleName = MiddleName;

    }

    public Author(String FirstName, String LastName) {
        this(FirstName, LastName, "");
    }

    @Override
    // Делаем вывод метода в визуально удобном представлении
    public String toString() {
        final StringBuilder fullName = new StringBuilder(FirstName);
        fullName.append(" ").append(MiddleName);
        fullName.append(" ").append(LastName);
        return fullName.toString().replace("  ", " ");
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }
}
