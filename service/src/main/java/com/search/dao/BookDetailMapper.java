package com.search.dao;

import com.search.entity.BookDetail;
import com.search.entity.BookDetailExample;
import java.util.List;

import com.search.entity.vo.BookQueryVo;
import org.apache.ibatis.annotations.Param;

public interface BookDetailMapper {
    long countByExample(BookDetailExample example);

    int deleteByExample(BookDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookDetail record);

    int insertSelective(BookDetail record);

    List<BookDetail> selectByExampleWithBLOBs(BookDetailExample example);

    List<BookDetail> selectByExample(BookDetailExample example);

    BookDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookDetail record, @Param("example") BookDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") BookDetail record, @Param("example") BookDetailExample example);

    int updateByExample(@Param("record") BookDetail record, @Param("example") BookDetailExample example);

    int updateByPrimaryKeySelective(BookDetail record);

    int updateByPrimaryKeyWithBLOBs(BookDetail record);

    int updateByPrimaryKey(BookDetail record);

    List<BookDetail> contentQueryByContent(BookQueryVo bookQueryVo);
}