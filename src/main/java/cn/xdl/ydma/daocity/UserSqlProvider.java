package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogintime() != null) {
            sql.VALUES("lastLoginTime", "#{lastlogintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastupdatetime() != null) {
            sql.VALUES("lastUpdateTime", "#{lastupdatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAvatar() != null) {
            sql.VALUES("avatar", "#{avatar,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogintime() != null) {
            sql.SET("lastLoginTime = #{lastlogintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastupdatetime() != null) {
            sql.SET("lastUpdateTime = #{lastupdatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAvatar() != null) {
            sql.SET("avatar = #{avatar,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("userId = #{userid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}