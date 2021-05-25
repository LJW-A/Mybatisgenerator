package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.City;
import org.apache.ibatis.jdbc.SQL;

public class CitySqlProvider {

    public String insertSelective(City record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("city");
        
        if (record.getCityid() != null) {
            sql.VALUES("cityId", "#{cityid,jdbcType=INTEGER}");
        }
        
        if (record.getBelongto() != null) {
            sql.VALUES("belongTo", "#{belongto,jdbcType=VARCHAR}");
        }
        
        if (record.getEnname() != null) {
            sql.VALUES("enName", "#{enname,jdbcType=VARCHAR}");
        }
        
        if (record.getCnname() != null) {
            sql.VALUES("cnName", "#{cnname,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("level", "#{level,jdbcType=VARCHAR}");
        }
        
        if (record.getBaiduMapLng() != null) {
            sql.VALUES("baidu_map_lng", "#{baiduMapLng,jdbcType=DOUBLE}");
        }
        
        if (record.getBaiduMapLat() != null) {
            sql.VALUES("baidu_map_lat", "#{baiduMapLat,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(City record) {
        SQL sql = new SQL();
        sql.UPDATE("city");
        
        if (record.getBelongto() != null) {
            sql.SET("belongTo = #{belongto,jdbcType=VARCHAR}");
        }
        
        if (record.getEnname() != null) {
            sql.SET("enName = #{enname,jdbcType=VARCHAR}");
        }
        
        if (record.getCnname() != null) {
            sql.SET("cnName = #{cnname,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{level,jdbcType=VARCHAR}");
        }
        
        if (record.getBaiduMapLng() != null) {
            sql.SET("baidu_map_lng = #{baiduMapLng,jdbcType=DOUBLE}");
        }
        
        if (record.getBaiduMapLat() != null) {
            sql.SET("baidu_map_lat = #{baiduMapLat,jdbcType=DOUBLE}");
        }
        
        sql.WHERE("cityId = #{cityid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}