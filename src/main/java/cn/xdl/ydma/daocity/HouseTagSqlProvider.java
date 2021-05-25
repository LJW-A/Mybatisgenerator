package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HouseTag;
import org.apache.ibatis.jdbc.SQL;

public class HouseTagSqlProvider {

    public String insertSelective(HouseTag record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("house_tag");
        
        if (record.getHousetagid() != null) {
            sql.VALUES("housetagId", "#{housetagid,jdbcType=INTEGER}");
        }
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseId", "#{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getTagname() != null) {
            sql.VALUES("tagName", "#{tagname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HouseTag record) {
        SQL sql = new SQL();
        sql.UPDATE("house_tag");
        
        if (record.getHouseid() != null) {
            sql.SET("houseId = #{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getTagname() != null) {
            sql.SET("tagName = #{tagname,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("housetagId = #{housetagid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}