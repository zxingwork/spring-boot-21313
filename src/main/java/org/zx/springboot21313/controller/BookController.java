package org.zx.springboot21313.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zx.springboot21313.dao.BookDao;
import org.zx.springboot21313.model.Book;

import java.nio.charset.StandardCharsets;
import java.util.List;


@RestController
public class BookController {
    private BookDao bookDao;
    @Autowired
    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

    @RequestMapping("/books")
    public ModelAndView books(){
        ModelAndView mv = new ModelAndView();
        List<Book> books = bookDao.findAllBy();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
    @RequestMapping("/addbook")
    public Object addBook(String author, String name, float price){
        if (null==author||null==name){
            return "新增失败";
        }
        Book book = new Book();
        book.setID();
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);
        bookDao.save(book);
        return book;
    }
}
