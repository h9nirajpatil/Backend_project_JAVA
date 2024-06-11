package com.BMS.BMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//POST : Add book(book will also have author name as parameter where author would already been there),
// add author GET : the bookName with highest no. of pages.
//PUT the (path bookname, updated pages);
//API : GET author who has written the highest no. of pages
@RestController
@RequestMapping("/lms")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("update-book")
    public String updateBookByPage(@RequestParam String name, @RequestParam int page){
        return bookService.addPage(name,page);
    }

    @GetMapping("/get-author")
    public Author getAuthorByPages(){
        return bookService.getAuthorByPage();
    }

}
