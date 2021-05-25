package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HousePicture;
import org.apache.ibatis.jdbc.SQL;

public class HousePictureSqlProvider {

    public String insertSelective(HousePicture record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("house_picture");
        
        if (record.getHousepictureid() != null) {
            sql.VALUES("housePictureId", "#{housepictureid,jdbcType=INTEGER}");
        }
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseId", "#{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getCdnprefix() != null) {
            sql.VALUES("cdnPrefix", "#{cdnprefix,jdbcType=VARCHAR}");
        }
        
        if (record.getWidth() != null) {
            sql.VALUES("width", "#{width,jdbcType=INTEGER}");
        }
        
        if (record.getHeight() != null) {
            sql.VALUES("height", "#{height,jdbcType=INTEGER}");
        }
        
        if (record.getLocation() != null) {
            sql.VALUES("location", "#{location,jdbcType=VARCHAR}");
        }
        
        if (record.getPath() != null) {
            sql.VALUES("path", "#{path,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HousePicture record) {
        SQL sql = new SQL();
        sql.UPDATE("house_picture");
        
        if (record.getHouseid() != null) {
            sql.SET("houseId = #{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getCdnprefix() != null) {
            sql.SET("cdnPrefix = #{cdnprefix,jdbcType=VARCHAR}");
        }
        
        if (record.getWidth() != null) {
            sql.SET("width = #{width,jdbcType=INTEGER}");
        }
        
        if (record.getHeight() != null) {
            sql.SET("height = #{height,jdbcType=INTEGER}");
        }
        
        if (record.getLocation() != null) {
            sql.SET("location = #{location,jdbcType=VARCHAR}");
        }
        
        if (record.getPath() != null) {
            sql.SET("path = #{path,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("housePictureId = #{housepictureid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}