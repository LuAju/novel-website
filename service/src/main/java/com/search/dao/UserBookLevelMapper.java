package com.search.dao;

import com.search.entity.UserBookLevel;
import com.search.entity.UserBookLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBookLevelMapper {
    long countByExample(UserBookLevelExample example);

    int deleteByExample(UserBookLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBookLevel record);

    int insertSelective(UserBookLevel record);

    List<UserBookLevel> selectByExample(UserBookLevelExample example);

    UserBookLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBookLevel record, @Param("example") UserBookLevelExample example);

    int updateByExample(@Param("record") UserBookLevel record, @Param("example") UserBookLevelExample example);

    int updateByPrimaryKeySelective(UserBookLevel record);

    int updateByPrimaryKey(UserBookLevel record);
}