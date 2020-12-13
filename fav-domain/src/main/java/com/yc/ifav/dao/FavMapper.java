package com.yc.ifav.dao;

import com.yc.ifav.entity.Favs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FavMapper {

    @Select("Select * from favs")
    public List<Favs> findAllfavs();

    @Insert("insert into favs values(null,#{fname},#{furl},#{ftags},#{fdesc},now())")
    public int addFav(Favs favs);

    @Delete("delete from favs where f_id=#{fid}")
    public int delete(int fid);

}
