package org.zx.springboot21313.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zx.springboot21313.model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    public Book books(){
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
