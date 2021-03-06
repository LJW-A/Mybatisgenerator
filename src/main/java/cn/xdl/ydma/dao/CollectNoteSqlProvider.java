package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.CollectNote;
import org.apache.ibatis.jdbc.SQL;

public class CollectNoteSqlProvider {

    public String insertSelective(CollectNote record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("collect_note");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getNoteId() != null) {
            sql.VALUES("note_id", "#{noteId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectTime() != null) {
            sql.VALUES("collect_time", "#{collectTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CollectNote record) {
        SQL sql = new SQL();
        sql.UPDATE("collect_note");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getNoteId() != null) {
            sql.SET("note_id = #{noteId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectTime() != null) {
            sql.SET("collect_time = #{collectTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}