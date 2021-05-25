package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.SubwayStation;
import org.apache.ibatis.jdbc.SQL;

public class SubwayStationSqlProvider {

    public String insertSelective(SubwayStation record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("subway_station");
        
        if (record.getSubwaystationid() != null) {
            sql.VALUES("subwayStationId", "#{subwaystationid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwayid() != null) {
            sql.VALUES("subwayId", "#{subwayid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwaystationname() != null) {
            sql.VALUES("subwayStationName", "#{subwaystationname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SubwayStation record) {
        SQL sql = new SQL();
        sql.UPDATE("subway_station");
        
        if (record.getSubwayid() != null) {
            sql.SET("subwayId = #{subwayid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwaystationname() != null) {
            sql.SET("subwayStationName = #{subwaystationname,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("subwayStationId = #{subwaystationid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}