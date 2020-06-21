package com.search.service.impl;

import com.search.dao.BookDetailMapper;
import com.search.dao.UmsAdminMapper;
import com.search.entity.UmsAdmin;
import com.search.service.UmsAdminService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * UmsAdminService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    @Autowired
    private UmsAdminMapper umsAdminMapper;



    @Override
    public List<UmsAdmin> selectByUserInfo(UmsAdmin umsAdmin) {
        return umsAdminMapper.selectByUserInfo(umsAdmin);
    }

    @Override
    public int selectByUserName(UmsAdmin umsAdmin) {
        return umsAdminMapper.selectByUserName(umsAdmin);
    }
}
