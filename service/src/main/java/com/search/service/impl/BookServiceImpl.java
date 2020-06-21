package com.search.service.impl;

import com.search.dao.BookDetailMapper;
import com.search.entity.BookDetail;
import com.search.entity.vo.BookQueryVo;
import com.search.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService  {

    @Autowired
    private BookDetailMapper bookDetailMapper;

    @Override
    public List<BookDetail> contentQueryByContent(BookQueryVo bookQueryVo) {
        return bookDetailMapper.contentQueryByContent(bookQueryVo);
    }
}
