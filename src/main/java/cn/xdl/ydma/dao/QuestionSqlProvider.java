package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.QuestionWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class QuestionSqlProvider {

    public String insertSelective(QuestionWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("question");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAuthor() != null) {
            sql.VALUES("author", "#{author,jdbcType=INTEGER}");
        }
        
        if (record.getAddDate() != null) {
            sql.VALUES("add_date", "#{addDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDegree() != null) {
            sql.VALUES("degree", "#{degree,jdbcType=INTEGER}");
        }
        
        if (record.getAnswer() != null) {
            sql.VALUES("answer", "#{answer,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeId() != null) {
            sql.VALUES("type_id", "#{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getKnowledgeId() != null) {
            sql.VALUES("knowledge_id", "#{knowledgeId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            sql.VALUES("subject_id", "#{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getChapterId() != null) {
            sql.VALUES("chapter_id", "#{chapterId,jdbcType=INTEGER}");
        }
        
        if (record.getBody() != null) {
            sql.VALUES("body", "#{body,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAnalysis() != null) {
            sql.VALUES("analysis", "#{analysis,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(QuestionWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("question");
        
        if (record.getAuthor() != null) {
            sql.SET("author = #{author,jdbcType=INTEGER}");
        }
        
        if (record.getAddDate() != null) {
            sql.SET("add_date = #{addDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDegree() != null) {
            sql.SET("degree = #{degree,jdbcType=INTEGER}");
        }
        
        if (record.getAnswer() != null) {
            sql.SET("answer = #{answer,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeId() != null) {
            sql.SET("type_id = #{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getKnowledgeId() != null) {
            sql.SET("knowledge_id = #{knowledgeId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            sql.SET("subject_id = #{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getChapterId() != null) {
            sql.SET("chapter_id = #{chapterId,jdbcType=INTEGER}");
        }
        
        if (record.getBody() != null) {
            sql.SET("body = #{body,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAnalysis() != null) {
            sql.SET("analysis = #{analysis,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}