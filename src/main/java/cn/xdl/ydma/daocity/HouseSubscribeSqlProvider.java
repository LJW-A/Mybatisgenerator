package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HouseSubscribe;
import org.apache.ibatis.jdbc.SQL;

public class HouseSubscribeSqlProvider {

    public String insertSelective(HouseSubscribe record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("house_subscribe");
        
        if (record.getHousesubscribeid() != null) {
            sql.VALUES("houseSubscribeId", "#{housesubscribeid,jdbcType=INTEGER}");
        }
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseId", "#{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getDesc() != null) {
            sql.VALUES("desc", "#{desc,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createTime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastupdatetime() != null) {
            sql.VALUES("lastUpdateTime", "#{lastupdatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrdertime() != null) {
            sql.VALUES("orderTime", "#{ordertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTelephone() != null) {
            sql.VALUES("telephone", "#{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminid() != null) {
            sql.VALUES("adminId", "#{adminid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HouseSubscribe record) {
        SQL sql = new SQL();
        sql.UPDATE("house_subscribe");
        
        if (record.getHouseid() != null) {
            sql.SET("houseId = #{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{userid,jdbcType=INTEGER}");
        }
        
        if (record.getDesc() != null) {
            sql.SET("desc = #{desc,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createTime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastupdatetime() != null) {
            sql.SET("lastUpdateTime = #{lastupdatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrdertime() != null) {
            sql.SET("orderTime = #{ordertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTelephone() != null) {
            sql.SET("telephone = #{telephone,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminid() != null) {
            sql.SET("adminId = #{adminid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("houseSubscribeId = #{housesubscribeid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}