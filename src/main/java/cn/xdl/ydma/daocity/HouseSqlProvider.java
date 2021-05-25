package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.House;
import org.apache.ibatis.jdbc.SQL;

public class HouseSqlProvider {

    public String insertSelective(House record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("house");
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseId", "#{houseid,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=INTEGER}");
        }
        
        if (record.getArea() != null) {
            sql.VALUES("area", "#{area,jdbcType=REAL}");
        }
        
        if (record.getRoom() != null) {
            sql.VALUES("room", "#{room,jdbcType=INTEGER}");
        }
        
        if (record.getFloor() != null) {
            sql.VALUES("floor", "#{floor,jdbcType=INTEGER}");
        }
        
        if (record.getTotalfloor() != null) {
            sql.VALUES("totalFloor", "#{totalfloor,jdbcType=INTEGER}");
        }
        
        if (record.getWatchtimes() != null) {
            sql.VALUES("watchTimes", "#{watchtimes,jdbcType=INTEGER}");
        }
        
        if (record.getBuildyear() != null) {
            sql.VALUES("buildYear", "#{buildyear,jdbcType=INTEGER}");
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
        
        if (record.getCityenname() != null) {
            sql.VALUES("cityEnName", "#{cityenname,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionenname() != null) {
            sql.VALUES("regionEnName", "#{regionenname,jdbcType=VARCHAR}");
        }
        
        if (record.getCover() != null) {
            sql.VALUES("cover", "#{cover,jdbcType=VARCHAR}");
        }
        
        if (record.getDirection() != null) {
            sql.VALUES("direction", "#{direction,jdbcType=INTEGER}");
        }
        
        if (record.getDistancetosubway() != null) {
            sql.VALUES("distanceToSubway", "#{distancetosubway,jdbcType=INTEGER}");
        }
        
        if (record.getParlour() != null) {
            sql.VALUES("parlour", "#{parlour,jdbcType=INTEGER}");
        }
        
        if (record.getDistrict() != null) {
            sql.VALUES("district", "#{district,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminid() != null) {
            sql.VALUES("adminId", "#{adminid,jdbcType=INTEGER}");
        }
        
        if (record.getBathroom() != null) {
            sql.VALUES("bathroom", "#{bathroom,jdbcType=INTEGER}");
        }
        
        if (record.getStreet() != null) {
            sql.VALUES("street", "#{street,jdbcType=VARCHAR}");
        }
        
        if (record.getHousecode() != null) {
            sql.VALUES("houseCode", "#{housecode,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(House record) {
        SQL sql = new SQL();
        sql.UPDATE("house");
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=INTEGER}");
        }
        
        if (record.getArea() != null) {
            sql.SET("area = #{area,jdbcType=REAL}");
        }
        
        if (record.getRoom() != null) {
            sql.SET("room = #{room,jdbcType=INTEGER}");
        }
        
        if (record.getFloor() != null) {
            sql.SET("floor = #{floor,jdbcType=INTEGER}");
        }
        
        if (record.getTotalfloor() != null) {
            sql.SET("totalFloor = #{totalfloor,jdbcType=INTEGER}");
        }
        
        if (record.getWatchtimes() != null) {
            sql.SET("watchTimes = #{watchtimes,jdbcType=INTEGER}");
        }
        
        if (record.getBuildyear() != null) {
            sql.SET("buildYear = #{buildyear,jdbcType=INTEGER}");
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
        
        if (record.getCityenname() != null) {
            sql.SET("cityEnName = #{cityenname,jdbcType=VARCHAR}");
        }
        
        if (record.getRegionenname() != null) {
            sql.SET("regionEnName = #{regionenname,jdbcType=VARCHAR}");
        }
        
        if (record.getCover() != null) {
            sql.SET("cover = #{cover,jdbcType=VARCHAR}");
        }
        
        if (record.getDirection() != null) {
            sql.SET("direction = #{direction,jdbcType=INTEGER}");
        }
        
        if (record.getDistancetosubway() != null) {
            sql.SET("distanceToSubway = #{distancetosubway,jdbcType=INTEGER}");
        }
        
        if (record.getParlour() != null) {
            sql.SET("parlour = #{parlour,jdbcType=INTEGER}");
        }
        
        if (record.getDistrict() != null) {
            sql.SET("district = #{district,jdbcType=VARCHAR}");
        }
        
        if (record.getAdminid() != null) {
            sql.SET("adminId = #{adminid,jdbcType=INTEGER}");
        }
        
        if (record.getBathroom() != null) {
            sql.SET("bathroom = #{bathroom,jdbcType=INTEGER}");
        }
        
        if (record.getStreet() != null) {
            sql.SET("street = #{street,jdbcType=VARCHAR}");
        }
        
        if (record.getHousecode() != null) {
            sql.SET("houseCode = #{housecode,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("houseId = #{houseid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}