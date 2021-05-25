package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HouseTag;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HouseTagMapper {
    @Delete({
        "delete from house_tag",
        "where housetagId = #{housetagid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer housetagid);

    @Insert({
        "insert into house_tag (housetagId, houseId, ",
        "tagName)",
        "values (#{housetagid,jdbcType=INTEGER}, #{houseid,jdbcType=INTEGER}, ",
        "#{tagname,jdbcType=VARCHAR})"
    })
    int insert(HouseTag record);

    @InsertProvider(type=HouseTagSqlProvider.class, method="insertSelective")
    int insertSelective(HouseTag record);

    @Select({
        "select",
        "housetagId, houseId, tagName",
        "from house_tag",
        "where housetagId = #{housetagid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="housetagId", property="housetagid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="tagName", property="tagname", jdbcType=JdbcType.VARCHAR)
    })
    HouseTag selectByPrimaryKey(Integer housetagid);

    @UpdateProvider(type=HouseTagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HouseTag record);

    @Update({
        "update house_tag",
        "set houseId = #{houseid,jdbcType=INTEGER},",
          "tagName = #{tagname,jdbcType=VARCHAR}",
        "where housetagId = #{housetagid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HouseTag record);
}