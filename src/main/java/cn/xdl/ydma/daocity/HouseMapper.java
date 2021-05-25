package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.House;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HouseMapper {
    @Delete({
        "delete from house",
        "where houseId = #{houseid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer houseid);

    @Insert({
        "insert into house (houseId, title, ",
        "price, area, room, ",
        "floor, totalFloor, ",
        "watchTimes, buildYear, ",
        "status, createTime, ",
        "lastUpdateTime, cityEnName, ",
        "regionEnName, cover, ",
        "direction, distanceToSubway, ",
        "parlour, district, ",
        "adminId, bathroom, ",
        "street, houseCode)",
        "values (#{houseid,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=INTEGER}, #{area,jdbcType=REAL}, #{room,jdbcType=INTEGER}, ",
        "#{floor,jdbcType=INTEGER}, #{totalfloor,jdbcType=INTEGER}, ",
        "#{watchtimes,jdbcType=INTEGER}, #{buildyear,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{lastupdatetime,jdbcType=TIMESTAMP}, #{cityenname,jdbcType=VARCHAR}, ",
        "#{regionenname,jdbcType=VARCHAR}, #{cover,jdbcType=VARCHAR}, ",
        "#{direction,jdbcType=INTEGER}, #{distancetosubway,jdbcType=INTEGER}, ",
        "#{parlour,jdbcType=INTEGER}, #{district,jdbcType=VARCHAR}, ",
        "#{adminid,jdbcType=INTEGER}, #{bathroom,jdbcType=INTEGER}, ",
        "#{street,jdbcType=VARCHAR}, #{housecode,jdbcType=LONGVARCHAR})"
    })
    int insert(House record);

    @InsertProvider(type=HouseSqlProvider.class, method="insertSelective")
    int insertSelective(House record);

    @Select({
        "select",
        "houseId, title, price, area, room, floor, totalFloor, watchTimes, buildYear, ",
        "status, createTime, lastUpdateTime, cityEnName, regionEnName, cover, direction, ",
        "distanceToSubway, parlour, district, adminId, bathroom, street, houseCode",
        "from house",
        "where houseId = #{houseid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="area", property="area", jdbcType=JdbcType.REAL),
        @Result(column="room", property="room", jdbcType=JdbcType.INTEGER),
        @Result(column="floor", property="floor", jdbcType=JdbcType.INTEGER),
        @Result(column="totalFloor", property="totalfloor", jdbcType=JdbcType.INTEGER),
        @Result(column="watchTimes", property="watchtimes", jdbcType=JdbcType.INTEGER),
        @Result(column="buildYear", property="buildyear", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lastUpdateTime", property="lastupdatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cityEnName", property="cityenname", jdbcType=JdbcType.VARCHAR),
        @Result(column="regionEnName", property="regionenname", jdbcType=JdbcType.VARCHAR),
        @Result(column="cover", property="cover", jdbcType=JdbcType.VARCHAR),
        @Result(column="direction", property="direction", jdbcType=JdbcType.INTEGER),
        @Result(column="distanceToSubway", property="distancetosubway", jdbcType=JdbcType.INTEGER),
        @Result(column="parlour", property="parlour", jdbcType=JdbcType.INTEGER),
        @Result(column="district", property="district", jdbcType=JdbcType.VARCHAR),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER),
        @Result(column="bathroom", property="bathroom", jdbcType=JdbcType.INTEGER),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="houseCode", property="housecode", jdbcType=JdbcType.LONGVARCHAR)
    })
    House selectByPrimaryKey(Integer houseid);

    @UpdateProvider(type=HouseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(House record);

    @Update({
        "update house",
        "set title = #{title,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=INTEGER},",
          "area = #{area,jdbcType=REAL},",
          "room = #{room,jdbcType=INTEGER},",
          "floor = #{floor,jdbcType=INTEGER},",
          "totalFloor = #{totalfloor,jdbcType=INTEGER},",
          "watchTimes = #{watchtimes,jdbcType=INTEGER},",
          "buildYear = #{buildyear,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "lastUpdateTime = #{lastupdatetime,jdbcType=TIMESTAMP},",
          "cityEnName = #{cityenname,jdbcType=VARCHAR},",
          "regionEnName = #{regionenname,jdbcType=VARCHAR},",
          "cover = #{cover,jdbcType=VARCHAR},",
          "direction = #{direction,jdbcType=INTEGER},",
          "distanceToSubway = #{distancetosubway,jdbcType=INTEGER},",
          "parlour = #{parlour,jdbcType=INTEGER},",
          "district = #{district,jdbcType=VARCHAR},",
          "adminId = #{adminid,jdbcType=INTEGER},",
          "bathroom = #{bathroom,jdbcType=INTEGER},",
          "street = #{street,jdbcType=VARCHAR},",
          "houseCode = #{housecode,jdbcType=LONGVARCHAR}",
        "where houseId = #{houseid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(House record);

    @Update({
        "update house",
        "set title = #{title,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=INTEGER},",
          "area = #{area,jdbcType=REAL},",
          "room = #{room,jdbcType=INTEGER},",
          "floor = #{floor,jdbcType=INTEGER},",
          "totalFloor = #{totalfloor,jdbcType=INTEGER},",
          "watchTimes = #{watchtimes,jdbcType=INTEGER},",
          "buildYear = #{buildyear,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "lastUpdateTime = #{lastupdatetime,jdbcType=TIMESTAMP},",
          "cityEnName = #{cityenname,jdbcType=VARCHAR},",
          "regionEnName = #{regionenname,jdbcType=VARCHAR},",
          "cover = #{cover,jdbcType=VARCHAR},",
          "direction = #{direction,jdbcType=INTEGER},",
          "distanceToSubway = #{distancetosubway,jdbcType=INTEGER},",
          "parlour = #{parlour,jdbcType=INTEGER},",
          "district = #{district,jdbcType=VARCHAR},",
          "adminId = #{adminid,jdbcType=INTEGER},",
          "bathroom = #{bathroom,jdbcType=INTEGER},",
          "street = #{street,jdbcType=VARCHAR}",
        "where houseId = #{houseid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(House record);
}