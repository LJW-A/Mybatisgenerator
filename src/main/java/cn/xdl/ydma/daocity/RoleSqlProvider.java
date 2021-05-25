package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.Role;
import org.apache.ibatis.jdbc.SQL;

public class RoleSqlProvider {

    public String insertSelective(Role record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("role");
        
        if (record.getRoleid() != null) {
            sql.VALUES("roleId", "#{roleid,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getRolename() != null) {
            sql.VALUES("roleName", "#{rolename,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Role record) {
        SQL sql = new SQL();
        sql.UPDATE("role");
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{userid,jdbcType=INTEGER}");
        }
        
        if (record.getRolename() != null) {
            sql.SET("roleName = #{rolename,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("roleId = #{roleid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}