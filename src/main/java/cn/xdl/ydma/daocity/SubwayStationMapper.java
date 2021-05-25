package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.SubwayStation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SubwayStationMapper {
    @Delete({
        "delete from subway_station",
        "where subwayStationId = #{subwaystationid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer subwaystationid);

    @Insert({
        "insert into subway_station (subwayStationId, subwayId, ",
        "subwayStationName)",
        "values (#{subwaystationid,jdbcType=INTEGER}, #{subwayid,jdbcType=INTEGER}, ",
        "#{subwaystationname,jdbcType=VARCHAR})"
    })
    int insert(SubwayStation record);

    @InsertProvider(type=SubwayStationSqlProvider.class, method="insertSelective")
    int insertSelective(SubwayStation record);

    @Select({
        "select",
        "subwayStationId, subwayId, subwayStationName",
        "from subway_station",
        "where subwayStationId = #{subwaystationid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="subwayStationId", property="subwaystationid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="subwayId", property="subwayid", jdbcType=JdbcType.INTEGER),
        @Result(column="subwayStationName", property="subwaystationname", jdbcType=JdbcType.VARCHAR)
    })
    SubwayStation selectByPrimaryKey(Integer subwaystationid);

    @UpdateProvider(type=SubwayStationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SubwayStation record);

    @Update({
        "update subway_station",
        "set subwayId = #{subwayid,jdbcType=INTEGER},",
          "subwayStationName = #{subwaystationname,jdbcType=VARCHAR}",
        "where subwayStationId = #{subwaystationid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SubwayStation record);
}