package com.search.service.impl;

import com.search.dao.PicInfoMapper;
import com.search.entity.PicInfo;
import com.search.service.PicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PicInfoServiceImpl implements PicInfoService {

    @Autowired
    private PicInfoMapper picInfoMapper;

    @Override
    public List<PicInfo> selectByInfoLike(String pickInfo) {
        List<PicInfo> picInfos = picInfoMapper.selectByInfoLike(pickInfo);
        return picInfos;
    }

    @Override
    public int insert(PicInfo picInfo) {
        return picInfoMapper.insert(picInfo);
    }
}
