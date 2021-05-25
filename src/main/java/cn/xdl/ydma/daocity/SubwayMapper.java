package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.Subway;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface SubwayMapper {
    @Delete({
        "delete from subway",
        "where subwayId = #{subwayid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer subwayid);

    @Insert({
        "insert into subway (subwayId, subwayName, ",
        "cityEnName)",
        "values (#{subwayid,jdbcType=INTEGER}, #{subwayname,jdbcType=VARCHAR}, ",
        "#{cityenname,jdbcType=VARCHAR})"
    })
    int insert(Subway record);

    @InsertProvider(type=SubwaySqlProvider.class, method="insertSelective")
    int insertSelective(Subway record);

    @Select({
        "select",
        "subwayId, subwayName, cityEnName",
        "from subway",
        "where subwayId = #{subwayid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="subwayId", property="subwayid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="subwayName", property="subwayname", jdbcType=JdbcType.VARCHAR),
        @Result(column="cityEnName", property="cityenname", jdbcType=JdbcType.VARCHAR)
    })
    Subway selectByPrimaryKey(Integer subwayid);

    @UpdateProvider(type=SubwaySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Subway record);

    @Update({
        "update subway",
        "set subwayName = #{subwayname,jdbcType=VARCHAR},",
          "cityEnName = #{cityenname,jdbcType=VARCHAR}",
        "where subwayId = #{subwayid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Subway record);
}