import Library.Author;
import Library.Book;
public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 12");

        Author moorcock = new Author("Майкл", "Муркок");
        Author chuckovsky = new Author("Николай", "Чуковский");
        Book swordLords = new Book("Повелители мечей", moorcock, 1977);
        Book frigatDrivers = new Book("Водители фрегатов", chuckovsky, 1941);

        swordLords.setBookYear(1971);

        // Вывод в консоль для наглядности
        System.out.printf("Книга %s была написана %s и впервые издана в %d году.\n",
                frigatDrivers.getBookName(),
                chuckovsky.getAuthorSurname(),
                frigatDrivers.getBookYear());
        System.out.printf("Книга %s была написана %s и впервые издана в %d году.\n",
                swordLords.getBookName(),
                moorcock.getAuthorSurname(),
                swordLords.getBookYear());

        // Код для тестирования домашки 13
        if(swordLords.equals(frigatDrivers)) {
            System.out.println("Книги одинаковы");
        } else {
            System.out.println("Книги разные");
        }

        System.out.println(swordLords.hashCode());
        System.out.println(swordLords);
        System.out.println(frigatDrivers);
        System.out.println(frigatDrivers.hashCode());
    }
}