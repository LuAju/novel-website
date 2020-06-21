package com.search.service;

import com.search.entity.BookDetail;
import com.search.entity.vo.BookQueryVo;

import java.util.List;

public interface BookService {
    List<BookDetail> contentQueryByContent(BookQueryVo bookQueryVo);
}
