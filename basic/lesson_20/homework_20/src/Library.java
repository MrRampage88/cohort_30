import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Создаем экземпляр библиотеки
        Library library = new Library();

        // Добавляем несколько книг
        library.addBook(new Book("Алиса в стране чудес", "Льюис Кэрролл"));
        library.addBook(new Book("Гарри Поттер и философский камень", "Джоан Роулинг"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));

        // Поиск книг по автору
        List<Book> booksByAuthor = library.searchByAuthor("Джоан Роулинг");
        System.out.println("Книги автора Джоан Роулинг:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Поиск книг по названию
        List<Book> booksByTitle = library.searchByTitle("Мастер и Маргарита");
        System.out.println("Книги с названием Мастер и Маргарита:");
        for (Book book : booksByTitle) {
            System.out.println(book.getAuthor());
        }
    }
}
