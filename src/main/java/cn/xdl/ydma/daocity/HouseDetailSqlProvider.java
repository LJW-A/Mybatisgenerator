package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HouseDetail;
import org.apache.ibatis.jdbc.SQL;

public class HouseDetailSqlProvider {

    public String insertSelective(HouseDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("house_detail");
        
        if (record.getHousedetailid() != null) {
            sql.VALUES("houseDetailId", "#{housedetailid,jdbcType=INTEGER}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("description", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getLayoutdesc() != null) {
            sql.VALUES("layoutDesc", "#{layoutdesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTraffic() != null) {
            sql.VALUES("traffic", "#{traffic,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundservice() != null) {
            sql.VALUES("roundService", "#{roundservice,jdbcType=VARCHAR}");
        }
        
        if (record.getRentway() != null) {
            sql.VALUES("rentWay", "#{rentway,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSubwayid() != null) {
            sql.VALUES("subwayId", "#{subwayid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwayname() != null) {
            sql.VALUES("subwayName", "#{subwayname,jdbcType=VARCHAR}");
        }
        
        if (record.getSubwaystationid() != null) {
            sql.VALUES("subwayStationId", "#{subwaystationid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwaystationname() != null) {
            sql.VALUES("subwayStationName", "#{subwaystationname,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseid() != null) {
            sql.VALUES("houseId", "#{houseid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(HouseDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("house_detail");
        
        if (record.getDescription() != null) {
            sql.SET("description = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getLayoutdesc() != null) {
            sql.SET("layoutDesc = #{layoutdesc,jdbcType=VARCHAR}");
        }
        
        if (record.getTraffic() != null) {
            sql.SET("traffic = #{traffic,jdbcType=VARCHAR}");
        }
        
        if (record.getRoundservice() != null) {
            sql.SET("roundService = #{roundservice,jdbcType=VARCHAR}");
        }
        
        if (record.getRentway() != null) {
            sql.SET("rentWay = #{rentway,jdbcType=INTEGER}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSubwayid() != null) {
            sql.SET("subwayId = #{subwayid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwayname() != null) {
            sql.SET("subwayName = #{subwayname,jdbcType=VARCHAR}");
        }
        
        if (record.getSubwaystationid() != null) {
            sql.SET("subwayStationId = #{subwaystationid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwaystationname() != null) {
            sql.SET("subwayStationName = #{subwaystationname,jdbcType=VARCHAR}");
        }
        
        if (record.getHouseid() != null) {
            sql.SET("houseId = #{houseid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("houseDetailId = #{housedetailid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}