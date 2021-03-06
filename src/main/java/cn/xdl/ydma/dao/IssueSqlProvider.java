package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.Issue;
import org.apache.ibatis.jdbc.SQL;

public class IssueSqlProvider {

    public String insertSelective(Issue record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("issue");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getHeadline() != null) {
            sql.VALUES("headline", "#{headline,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueContext() != null) {
            sql.VALUES("issue_context", "#{issueContext,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishTime() != null) {
            sql.VALUES("publish_time", "#{publishTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnswerCount() != null) {
            sql.VALUES("answer_count", "#{answerCount,jdbcType=INTEGER}");
        }
        
        if (record.getBrowseCount() != null) {
            sql.VALUES("browse_count", "#{browseCount,jdbcType=INTEGER}");
        }
        
        if (record.getVideoId() != null) {
            sql.VALUES("video_id", "#{videoId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getRightAnswerId() != null) {
            sql.VALUES("right_answer_id", "#{rightAnswerId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Issue record) {
        SQL sql = new SQL();
        sql.UPDATE("issue");
        
        if (record.getHeadline() != null) {
            sql.SET("headline = #{headline,jdbcType=VARCHAR}");
        }
        
        if (record.getIssueContext() != null) {
            sql.SET("issue_context = #{issueContext,jdbcType=VARCHAR}");
        }
        
        if (record.getPublishTime() != null) {
            sql.SET("publish_time = #{publishTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAnswerCount() != null) {
            sql.SET("answer_count = #{answerCount,jdbcType=INTEGER}");
        }
        
        if (record.getBrowseCount() != null) {
            sql.SET("browse_count = #{browseCount,jdbcType=INTEGER}");
        }
        
        if (record.getVideoId() != null) {
            sql.SET("video_id = #{videoId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getRightAnswerId() != null) {
            sql.SET("right_answer_id = #{rightAnswerId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}