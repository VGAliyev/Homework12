package Library;

public class Author {
    private String authorName;
    private String authorSurname;

    public Author(String name, String surname) {
        this.authorName = name;
        this.authorSurname = surname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    public String toString() {
        return this.authorName + " " + this.authorSurname;
    }

    public boolean equals(Author author) {
        return this.authorName.equals(author.authorName) && this.authorSurname.equals(author.authorSurname);
    }

    public int hashCode() {
        // Для обеспечения уникальности хешкода умножаем его на достаточно большое простое число (в данном случае 31)
        // https://stackoverflow.com/questions/3613102/why-use-a-prime-number-in-hashcode
        // Effective Java (Joshua Bloch)
        // Заметки для себя)))
        return 31 * this.authorName.hashCode() + 31 * this.authorSurname.hashCode();
    }
}