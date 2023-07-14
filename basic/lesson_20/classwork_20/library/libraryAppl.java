package library;

import library.models.Book;

public class libraryAppl {
    private static Book[] books;

    public static void main(String[] args) {


        Book[] books; // создаем массив типа Book

        books = new Book[4];
        // создаем конкретные объекты класса Book
        books[0] = new Book("War and Peace", "Lev Tolstoi", 1990,2000000000000L);
        books[1] = new Book("Anna Karenina", "Lev Tolstoi", 1995,2000000000001L);
        books[2] = new Book("451", "Ray Bredberry", 1965,2000000000002L);
        books[3] = new Book("1984", "George Orwell", 1985,2000000000003L);

        // добавили книги в библиотеку

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }

        System.out.println(library.getSize());

        Book[] booksf;
        booksf = library.findBookAuthor("Lev Tolstoi", books);

        for (int i = 0; i < booksf.length; i++) {
            System.out.println(booksf[i]);

        }
    }
}
