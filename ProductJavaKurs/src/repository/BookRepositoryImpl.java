package repository;

import model.Book;

//clasa implementująca 2 interface (można po dowolnie wielu nie tak jak w dziedziczeniu)

public class BookRepositoryImpl implements BookRepository, Logable {

    //ponieważ ta klasa nie będzie miała dostępu do

    @Override
    public Integer delete(Integer id) {
        return null;
    }
    //tablic main w bezpośredni sposób (są private)
    //a chcemy z nich korzystać to tworzymy sobie
    //tu prywatne pola

    private Book[] books;
    private Integer indexOfEmptyBooksPosition;

    //importujemy do naszych lokalnych pól tablicę książek
    public BookRepositoryImpl(Book[] books) {
        this.books = books;
    }


    //implementacja metody z interface
    @Override
    public void save(Book book) {
        Book foundBook = findBookById(book.getId());

        if (foundBook == null) {
            indexOfEmptyBooksPosition = getIndexOfEmptyBooksPosition();

            if (isBookAccessibleToAddNewBook()) {
                books[indexOfEmptyBooksPosition] = book;
            }

        }

    }

    @Override
    public Book update(Book book) {
        return null;
    }



    //szukanie książek po id
    @Override
    public Book findBookById(Integer id) {
        //for each
        for (Book book : books) {
            //tu nie można po prostu szukać, bo w którymś momencie
            //jeśli cała tablica nie jest zapełniona byłoby porównanie coś == null i
            //wtedy program się wywali
            if (bookExists(book,id)) {
                return book;
            }
        }
        return null;
    }


    @Override
    public void before() {
    }

    @Override
    public void after() {
    }


    private Integer getIndexOfEmptyBooksPosition() {
        Integer index = 0;
        //szukamy wolnego indeksu - jest ryzyko że będzie to index poza wymiarem naszej tablicy
        for (Book book : books) {
            if (books[index] == null) {
                return index;
            }
            index++;
        }
        return index;
    }


    private Boolean isBookAccessibleToAddNewBook() {
        //sprawdamy czy jest jeszcze wolna pozycja w naszej liście
        return indexOfEmptyBooksPosition != null && indexOfEmptyBooksPosition < books.length;

    }

    private Boolean bookExists (Book book, Integer id){
        //zabezpieczenie przed nullPointer exception + porównywanie książki po id
        //id nie jest typu prymitywnego więc musi być metoda equals
        //porówanie  ==  zawsze da fałsz, bo to jest obiekt i niezaleznie od treści będą
        // różne referencje
        return book !=null && book.getId().equals(id);

    }


}
