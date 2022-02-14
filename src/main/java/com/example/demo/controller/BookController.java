package com.example.demo.controller;
import com.example.demo.model.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/book")
public class BookController {
    public ArrayList<BookDto> books = new ArrayList<BookDto>();
    @GetMapping("/create")
    public String bookFormGet(Model model){
        BookDto bookDto = new BookDto();
        model.addAttribute("bookDto",bookDto);
        return "book-create";
    }
    @PostMapping("/create")
    public String saveBook(BookDto bookDto, Model model){
        model.addAttribute("newBook",bookDto);
        books.add(bookDto);
        model.addAttribute("books",books);
        return "book-create";
    }
}
