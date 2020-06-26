package com.search.service;

import com.search.entity.PicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PicInfoService {

    // 根据信息模糊查找所有的图片
    List<PicInfo> selectByInfoLike(@Param("picInfo")String pickInfo);

    // 插入一条图片
    int insert(PicInfo picInfo);
}
