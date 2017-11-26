package repository;
import model.Book;

public interface BookRepository {

    //interface to kontrakt z klientem
    //nie możemy tworzyć obiektow interfaców

    void save(Book book);

    Book findBookById(Integer id);

    Integer delete(Integer id);

    Book update(Book book);

}
