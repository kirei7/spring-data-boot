package com.userok.learn.sdata;

import com.userok.learn.sdata.data.entities.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(App.class);
        BookRepository repository = context.getBean(BookRepository.class);
        Book  book= new Book();
        book.setTitle("A test book");
        book.setPageCount(200);
        book.setPublishDate(new Date());

        repository.save(book);
        System.out.println("COUNT==============" + repository.count());
    }
}
