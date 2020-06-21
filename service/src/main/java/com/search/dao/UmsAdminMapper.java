package com.search.dao;

import com.search.entity.UmsAdmin;
import java.util.List;

public interface UmsAdminMapper {
    List<UmsAdmin> selectByUserInfo(UmsAdmin umsAdmin);

    int selectByUserName(UmsAdmin umsAdmin);
}