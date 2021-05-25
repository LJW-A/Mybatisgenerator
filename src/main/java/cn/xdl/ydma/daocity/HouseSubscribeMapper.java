package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HouseSubscribe;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HouseSubscribeMapper {
    @Delete({
        "delete from house_subscribe",
        "where houseSubscribeId = #{housesubscribeid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer housesubscribeid);

    @Insert({
        "insert into house_subscribe (houseSubscribeId, houseId, ",
        "userId, desc, status, ",
        "createTime, lastUpdateTime, ",
        "orderTime, telephone, ",
        "adminId)",
        "values (#{housesubscribeid,jdbcType=INTEGER}, #{houseid,jdbcType=INTEGER}, ",
        "#{userid,jdbcType=INTEGER}, #{desc,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER}, ",
        "#{createtime,jdbcType=TIMESTAMP}, #{lastupdatetime,jdbcType=TIMESTAMP}, ",
        "#{ordertime,jdbcType=TIMESTAMP}, #{telephone,jdbcType=VARCHAR}, ",
        "#{adminid,jdbcType=INTEGER})"
    })
    int insert(HouseSubscribe record);

    @InsertProvider(type=HouseSubscribeSqlProvider.class, method="insertSelective")
    int insertSelective(HouseSubscribe record);

    @Select({
        "select",
        "houseSubscribeId, houseId, userId, desc, status, createTime, lastUpdateTime, ",
        "orderTime, telephone, adminId",
        "from house_subscribe",
        "where houseSubscribeId = #{housesubscribeid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="houseSubscribeId", property="housesubscribeid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="desc", property="desc", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lastUpdateTime", property="lastupdatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="orderTime", property="ordertime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="telephone", property="telephone", jdbcType=JdbcType.VARCHAR),
        @Result(column="adminId", property="adminid", jdbcType=JdbcType.INTEGER)
    })
    HouseSubscribe selectByPrimaryKey(Integer housesubscribeid);

    @UpdateProvider(type=HouseSubscribeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HouseSubscribe record);

    @Update({
        "update house_subscribe",
        "set houseId = #{houseid,jdbcType=INTEGER},",
          "userId = #{userid,jdbcType=INTEGER},",
          "desc = #{desc,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "lastUpdateTime = #{lastupdatetime,jdbcType=TIMESTAMP},",
          "orderTime = #{ordertime,jdbcType=TIMESTAMP},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "adminId = #{adminid,jdbcType=INTEGER}",
        "where houseSubscribeId = #{housesubscribeid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HouseSubscribe record);
}