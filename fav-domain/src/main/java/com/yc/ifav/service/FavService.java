package com.yc.ifav.service;

import com.yc.ifav.domain.FavDomain;
import com.yc.ifav.entity.Favs;


import java.util.List;


public interface FavService {

    //显示所有
    public List<FavDomain> list();

    //添加
    public int add(Favs favs);

    //删除
    public int delete(int fid);
}
