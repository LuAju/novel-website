package com.search.service;


import com.search.entity.UmsAdmin;

import java.util.List;


public interface UmsAdminService {
    List<UmsAdmin> selectByUserInfo(UmsAdmin umsAdmin);

    int selectByUserName(UmsAdmin umsAdmin);
}
