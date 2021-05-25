package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.Subway;
import org.apache.ibatis.jdbc.SQL;

public class SubwaySqlProvider {

    public String insertSelective(Subway record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("subway");
        
        if (record.getSubwayid() != null) {
            sql.VALUES("subwayId", "#{subwayid,jdbcType=INTEGER}");
        }
        
        if (record.getSubwayname() != null) {
            sql.VALUES("subwayName", "#{subwayname,jdbcType=VARCHAR}");
        }
        
        if (record.getCityenname() != null) {
            sql.VALUES("cityEnName", "#{cityenname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Subway record) {
        SQL sql = new SQL();
        sql.UPDATE("subway");
        
        if (record.getSubwayname() != null) {
            sql.SET("subwayName = #{subwayname,jdbcType=VARCHAR}");
        }
        
        if (record.getCityenname() != null) {
            sql.SET("cityEnName = #{cityenname,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("subwayId = #{subwayid,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}