package com.search.dao;

import com.search.entity.PicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PicInfoMapper {

    List<PicInfo> selectByInfoLike(@Param("picInfo") String picInfo);

    int insert(PicInfo picInfo);

}