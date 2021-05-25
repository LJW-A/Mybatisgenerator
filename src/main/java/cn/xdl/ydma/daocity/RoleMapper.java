package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RoleMapper {
    @Delete({
        "delete from role",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer roleid);

    @Insert({
        "insert into role (roleId, userId, ",
        "roleName)",
        "values (#{roleid,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{rolename,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    @Select({
        "select",
        "roleId, userId, roleName",
        "from role",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="roleId", property="roleid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="roleName", property="rolename", jdbcType=JdbcType.VARCHAR)
    })
    Role selectByPrimaryKey(Integer roleid);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update role",
        "set userId = #{userid,jdbcType=INTEGER},",
          "roleName = #{rolename,jdbcType=VARCHAR}",
        "where roleId = #{roleid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);
}