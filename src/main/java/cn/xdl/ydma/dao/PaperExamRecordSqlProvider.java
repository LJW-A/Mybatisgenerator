package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.PaperExamRecord;
import org.apache.ibatis.jdbc.SQL;

public class PaperExamRecordSqlProvider {

    public String insertSelective(PaperExamRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("paper_exam_record");
        
        if (record.getRecordId() != null) {
            sql.VALUES("record_id", "#{recordId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getPaperId() != null) {
            sql.VALUES("paper_id", "#{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionId() != null) {
            sql.VALUES("question_id", "#{questionId,jdbcType=INTEGER}");
        }
        
        if (record.getAnswer() != null) {
            sql.VALUES("answer", "#{answer,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PaperExamRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("paper_exam_record");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getPaperId() != null) {
            sql.SET("paper_id = #{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionId() != null) {
            sql.SET("question_id = #{questionId,jdbcType=INTEGER}");
        }
        
        if (record.getAnswer() != null) {
            sql.SET("answer = #{answer,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("record_id = #{recordId,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}