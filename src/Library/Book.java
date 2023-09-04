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
}
