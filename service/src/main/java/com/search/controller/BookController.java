package com.search.controller;

import com.search.entity.vo.BookQueryVo;
import com.search.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/query")
    public Object queryByContent(@RequestBody BookQueryVo bookQueryVo) {
        return bookService.contentQueryByContent(bookQueryVo);
    }
}
