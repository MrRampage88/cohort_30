package library.models;

//добавление ; удаление ; поиск книги
public class Library {
    private final Book[] books;//массив типа Book, куда попадут все книги в библиотеке
    private int size;//кол-во книг в библиотеке


    //метод класса, который задает размер библиотеки , т.е длину массива Book
    public Library(int capacity) {
        books = new Book[capacity];

    }

    // метод добавления книги

    public boolean addBook(Book book) {
        if ((size == book.length) || findBook(book.getIsbn()) != null) {
            return false;//не можем добавить книгу ; так как нет места или такая книга уже есть.
        }
        books[size] = book; // помещаем книгу в массив
        size++;
        return true;
    }


    //метод поиска книги по ISBN
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {//пробегаем по массиву
            if (books[i].getIsbn() == isbn) {//проверяем совпадение  ISBN
                return books[i];// возвращаем элемент массива типа Book
            }
        }
        return null;
    }

    //метод поиска по автору 
    public Book[] findBookAuthor (String author, Book[] books) {
        //count how many books of author
        int count = 0;
        for (int i = 0; i < books.length; i++) { // пробегаем по массиву
            if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
                count++; // возвращаем элемент массива типа Book
            }
        }
        System.out.println("Number of books: " + count);

        //заполним массив с результатами поиска
        Book[] booksf = new Book[count]; // определил массив размером по кол-ву найденных
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < books.length; j++) { // пробегаем по массиву
                if (author.equals(books[j].getAuthor())) { // проверяем совпадение строк в поле author
                    booksf[i] = books[j]; // заполняем массив booksf
                    i++;
                }
            }
        }
        return booksf;
    }

    public int getSize() {
        return size;

    }
}
