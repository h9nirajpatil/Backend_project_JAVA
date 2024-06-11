package com.programmer.LMS;

import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class BookRepository {
    private HashMap<String, Author> authorHashMap;
    private HashMap<String, Book> bookHashMap;
    private HashMap<Book,Author> bookAuthorHashMap;

    public BookRepository() {
        this.authorHashMap = new HashMap<String,Author>();
        this.bookHashMap = new HashMap<String,Book>();
    }

    public String addBook(Book book){
        int page = book.getPages();
        Author author = new Author(book.getAge(),book.getName(),book.getGender(),book.getRating());
        book = new Book(page);
        authorHashMap.put(author.getName(),author);
        bookHashMap.put(author.getName(), book);
        return "Book added";
    }
    public String addPage(String name, int newPage){
        if(!authorHashMap.containsKey(name)){
            return "Author is not available";
        }
        Book book = bookHashMap.get(name);
        book.setPages(newPage);
        return "new page added";
    }
    public Author getAuthorByPages(){
        int highestPage = Integer.MIN_VALUE;
        Author existinAuthor = null;
        for(String author : bookHashMap.keySet()){
            int page = bookHashMap.get(author).getPages();
            if(page > highestPage){
                highestPage = page;
                existinAuthor = authorHashMap.get(author);
            }
        }
        return existinAuthor;
    }

}
