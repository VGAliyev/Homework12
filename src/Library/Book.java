package Library;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int bookYear;

    public Book(String name, Author author, int year) {
        this.bookName = name;
        this.bookAuthor = author;
        this.bookYear = year;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getBookAuthor() {
        return  this.bookAuthor;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int year) {
        this.bookYear = year;
    }

    public String toString() {
        return this.bookName + ", написана " + this.bookAuthor.toString() + " и издана в " + this.bookYear + " году.";
    }

    public boolean equals(Book book) {
        if (this.bookAuthor.equals(book.bookAuthor)) {
            return this.bookName.equals(book.bookName) && this.bookYear == book.bookYear;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return 31 * this.bookAuthor.hashCode() + 31 * this.bookName.hashCode() + 31 * this.bookYear;
    }
}
