package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    @Delete({
        "delete from user",
        "where userId = #{userid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userid);

    @Insert({
        "insert into user (userId, username, ",
        "email, phone, password, ",
        "status, createTime, ",
        "lastLoginTime, lastUpdateTime, ",
        "avatar)",
        "values (#{userid,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=INTEGER}, #{createtime,jdbcType=TIMESTAMP}, ",
        "#{lastlogintime,jdbcType=TIMESTAMP}, #{lastupdatetime,jdbcType=TIMESTAMP}, ",
        "#{avatar,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "userId, username, email, phone, password, status, createTime, lastLoginTime, ",
        "lastUpdateTime, avatar",
        "from user",
        "where userId = #{userid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="createTime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lastLoginTime", property="lastlogintime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="lastUpdateTime", property="lastupdatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer userid);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set username = #{username,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=INTEGER},",
          "createTime = #{createtime,jdbcType=TIMESTAMP},",
          "lastLoginTime = #{lastlogintime,jdbcType=TIMESTAMP},",
          "lastUpdateTime = #{lastupdatetime,jdbcType=TIMESTAMP},",
          "avatar = #{avatar,jdbcType=VARCHAR}",
        "where userId = #{userid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}