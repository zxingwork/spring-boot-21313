package org.zx.springboot21313.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.zx.springboot21313.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BookDao extends  CrudRepository<Book, Integer> {
    List<Book> findAllBy();
    List<Book> findByName(String name);
    List<Book> findByAuthor(String author);
}
