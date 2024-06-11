package com.BMS.BMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public String addBook(Book book){
        return bookRepository.addBook(book);
    }
    public String addPage(String name, int page){
        return bookRepository.addPage(name,page);
    }
    public Author getAuthorByPage(){
        return bookRepository.getAuthorByPages();
    }
}
