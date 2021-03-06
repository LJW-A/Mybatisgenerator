package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.PaperExamReport;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PaperExamReportMapper {
    @Delete({
        "delete from paper_exam_report",
        "where report_id = #{reportId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer reportId);

    @Insert({
        "insert into paper_exam_report (report_id, user_id, ",
        "paper_id, error_num, ",
        "right_num, score, ",
        "submit_time, create_time, ",
        "content)",
        "values (#{reportId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{paperId,jdbcType=INTEGER}, #{errorNum,jdbcType=INTEGER}, ",
        "#{rightNum,jdbcType=INTEGER}, #{score,jdbcType=DOUBLE}, ",
        "#{submitTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(PaperExamReport record);

    @InsertProvider(type=PaperExamReportSqlProvider.class, method="insertSelective")
    int insertSelective(PaperExamReport record);

    @Select({
        "select",
        "report_id, user_id, paper_id, error_num, right_num, score, submit_time, create_time, ",
        "content",
        "from paper_exam_report",
        "where report_id = #{reportId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="report_id", property="reportId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="paper_id", property="paperId", jdbcType=JdbcType.INTEGER),
        @Result(column="error_num", property="errorNum", jdbcType=JdbcType.INTEGER),
        @Result(column="right_num", property="rightNum", jdbcType=JdbcType.INTEGER),
        @Result(column="score", property="score", jdbcType=JdbcType.DOUBLE),
        @Result(column="submit_time", property="submitTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    PaperExamReport selectByPrimaryKey(Integer reportId);

    @UpdateProvider(type=PaperExamReportSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PaperExamReport record);

    @Update({
        "update paper_exam_report",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "paper_id = #{paperId,jdbcType=INTEGER},",
          "error_num = #{errorNum,jdbcType=INTEGER},",
          "right_num = #{rightNum,jdbcType=INTEGER},",
          "score = #{score,jdbcType=DOUBLE},",
          "submit_time = #{submitTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where report_id = #{reportId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(PaperExamReport record);

    @Update({
        "update paper_exam_report",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "paper_id = #{paperId,jdbcType=INTEGER},",
          "error_num = #{errorNum,jdbcType=INTEGER},",
          "right_num = #{rightNum,jdbcType=INTEGER},",
          "score = #{score,jdbcType=DOUBLE},",
          "submit_time = #{submitTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where report_id = #{reportId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PaperExamReport record);
}