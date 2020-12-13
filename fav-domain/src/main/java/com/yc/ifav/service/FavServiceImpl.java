package com.yc.ifav.service;

import com.yc.ifav.dao.FavMapper;
import com.yc.ifav.domain.FavDomain;
import com.yc.ifav.entity.Favs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Service
public class FavServiceImpl implements FavService{

    @Autowired(required = false)
    private FavMapper favMapper;


    @Transactional(readOnly = true)
    @Override
    public List<FavDomain> list() {
        //@TODO: 缓存
        //2.缓存没有，则在数据查
        List<Favs> list=favMapper.findAllfavs();

        //将实体类转为 domain
        //public FavDomain(String fname, String furl, String fdesc, String fdate, String favator, String tname, Integer type,String ftags)
        List<FavDomain> favDomains=new ArrayList<>();
        for (Favs fav: list){
            FavDomain favDomain=new FavDomain(fav.getFname(),fav.getFurl(),fav.getFdesc(),fav.getFdate(),
                    getIcon(fav.getFurl()),fav.getFtags());
        }
        return favDomains;
    }

    @Override
    public int add(Favs fav) {
        return favMapper.addFav(fav);
    }

    @Override
    public int delete(int fid) {
        return favMapper.delete(fid);
    }

    public String getIcon(String url){
        //https://leetcode-cn.com/favicon.ico
        String []us=url.split("/");
        if(us.length<3){
            return "NO ICO";
        }
        String Icon=us[0]+us[1]+us[2]+"/favicon.ico";
        return Icon;
    }
}
