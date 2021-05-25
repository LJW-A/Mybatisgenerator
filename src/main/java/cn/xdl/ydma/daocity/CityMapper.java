package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CityMapper {
    @Delete({
        "delete from city",
        "where cityId = #{cityid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cityid);

    @Insert({
        "insert into city (cityId, belongTo, ",
        "enName, cnName, ",
        "level, baidu_map_lng, ",
        "baidu_map_lat)",
        "values (#{cityid,jdbcType=INTEGER}, #{belongto,jdbcType=VARCHAR}, ",
        "#{enname,jdbcType=VARCHAR}, #{cnname,jdbcType=VARCHAR}, ",
        "#{level,jdbcType=VARCHAR}, #{baiduMapLng,jdbcType=DOUBLE}, ",
        "#{baiduMapLat,jdbcType=DOUBLE})"
    })
    int insert(City record);

    @InsertProvider(type=CitySqlProvider.class, method="insertSelective")
    int insertSelective(City record);

    @Select({
        "select",
        "cityId, belongTo, enName, cnName, level, baidu_map_lng, baidu_map_lat",
        "from city",
        "where cityId = #{cityid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cityId", property="cityid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="belongTo", property="belongto", jdbcType=JdbcType.VARCHAR),
        @Result(column="enName", property="enname", jdbcType=JdbcType.VARCHAR),
        @Result(column="cnName", property="cnname", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="baidu_map_lng", property="baiduMapLng", jdbcType=JdbcType.DOUBLE),
        @Result(column="baidu_map_lat", property="baiduMapLat", jdbcType=JdbcType.DOUBLE)
    })
    City selectByPrimaryKey(Integer cityid);

    @UpdateProvider(type=CitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(City record);

    @Update({
        "update city",
        "set belongTo = #{belongto,jdbcType=VARCHAR},",
          "enName = #{enname,jdbcType=VARCHAR},",
          "cnName = #{cnname,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=VARCHAR},",
          "baidu_map_lng = #{baiduMapLng,jdbcType=DOUBLE},",
          "baidu_map_lat = #{baiduMapLat,jdbcType=DOUBLE}",
        "where cityId = #{cityid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(City record);
}