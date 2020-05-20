package lito.demo.repository;
import lito.demo.models.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author oktay
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer>{

    Book findOne(Integer bookId);

    void delete(Integer bookId);
}
