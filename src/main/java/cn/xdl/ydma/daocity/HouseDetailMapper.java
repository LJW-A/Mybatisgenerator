package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HouseDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HouseDetailMapper {
    @Delete({
        "delete from house_detail",
        "where houseDetailId = #{housedetailid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer housedetailid);

    @Insert({
        "insert into house_detail (houseDetailId, description, ",
        "layoutDesc, traffic, ",
        "roundService, rentWay, ",
        "address, subwayId, ",
        "subwayName, subwayStationId, ",
        "subwayStationName, houseId)",
        "values (#{housedetailid,jdbcType=INTEGER}, #{description,jdbcType=VARCHAR}, ",
        "#{layoutdesc,jdbcType=VARCHAR}, #{traffic,jdbcType=VARCHAR}, ",
        "#{roundservice,jdbcType=VARCHAR}, #{rentway,jdbcType=INTEGER}, ",
        "#{address,jdbcType=VARCHAR}, #{subwayid,jdbcType=INTEGER}, ",
        "#{subwayname,jdbcType=VARCHAR}, #{subwaystationid,jdbcType=INTEGER}, ",
        "#{subwaystationname,jdbcType=VARCHAR}, #{houseid,jdbcType=INTEGER})"
    })
    int insert(HouseDetail record);

    @InsertProvider(type=HouseDetailSqlProvider.class, method="insertSelective")
    int insertSelective(HouseDetail record);

    @Select({
        "select",
        "houseDetailId, description, layoutDesc, traffic, roundService, rentWay, address, ",
        "subwayId, subwayName, subwayStationId, subwayStationName, houseId",
        "from house_detail",
        "where houseDetailId = #{housedetailid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="houseDetailId", property="housedetailid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="layoutDesc", property="layoutdesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="traffic", property="traffic", jdbcType=JdbcType.VARCHAR),
        @Result(column="roundService", property="roundservice", jdbcType=JdbcType.VARCHAR),
        @Result(column="rentWay", property="rentway", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="subwayId", property="subwayid", jdbcType=JdbcType.INTEGER),
        @Result(column="subwayName", property="subwayname", jdbcType=JdbcType.VARCHAR),
        @Result(column="subwayStationId", property="subwaystationid", jdbcType=JdbcType.INTEGER),
        @Result(column="subwayStationName", property="subwaystationname", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER)
    })
    HouseDetail selectByPrimaryKey(Integer housedetailid);

    @UpdateProvider(type=HouseDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HouseDetail record);

    @Update({
        "update house_detail",
        "set description = #{description,jdbcType=VARCHAR},",
          "layoutDesc = #{layoutdesc,jdbcType=VARCHAR},",
          "traffic = #{traffic,jdbcType=VARCHAR},",
          "roundService = #{roundservice,jdbcType=VARCHAR},",
          "rentWay = #{rentway,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "subwayId = #{subwayid,jdbcType=INTEGER},",
          "subwayName = #{subwayname,jdbcType=VARCHAR},",
          "subwayStationId = #{subwaystationid,jdbcType=INTEGER},",
          "subwayStationName = #{subwaystationname,jdbcType=VARCHAR},",
          "houseId = #{houseid,jdbcType=INTEGER}",
        "where houseDetailId = #{housedetailid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HouseDetail record);
}