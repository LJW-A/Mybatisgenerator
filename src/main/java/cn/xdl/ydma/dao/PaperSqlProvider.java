package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.Paper;
import org.apache.ibatis.jdbc.SQL;

public class PaperSqlProvider {

    public String insertSelective(Paper record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("paper");
        
        if (record.getPaperId() != null) {
            sql.VALUES("paper_id", "#{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getTypeId() != null) {
            sql.VALUES("type_id", "#{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            sql.VALUES("subject_id", "#{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            sql.VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getLimitTime() != null) {
            sql.VALUES("limit_time", "#{limitTime,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.VALUES("createtime", "#{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBegintime() != null) {
            sql.VALUES("begintime", "#{begintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.VALUES("endtime", "#{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionTotal() != null) {
            sql.VALUES("question_total", "#{questionTotal,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Paper record) {
        SQL sql = new SQL();
        sql.UPDATE("paper");
        
        if (record.getTypeId() != null) {
            sql.SET("type_id = #{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            sql.SET("subject_id = #{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getScore() != null) {
            sql.SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getLimitTime() != null) {
            sql.SET("limit_time = #{limitTime,jdbcType=INTEGER}");
        }
        
        if (record.getCreatetime() != null) {
            sql.SET("createtime = #{createtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBegintime() != null) {
            sql.SET("begintime = #{begintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("endtime = #{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionTotal() != null) {
            sql.SET("question_total = #{questionTotal,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("paper_id = #{paperId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}