package cn.xdl.ydma.dao;

import cn.xdl.ydma.entity.Question;
import cn.xdl.ydma.entity.QuestionWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface QuestionMapper {
    @Delete({
        "delete from question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into question (id, author, ",
        "add_date, degree, ",
        "answer, type_id, ",
        "knowledge_id, subject_id, ",
        "chapter_id, body, ",
        "analysis)",
        "values (#{id,jdbcType=INTEGER}, #{author,jdbcType=INTEGER}, ",
        "#{addDate,jdbcType=TIMESTAMP}, #{degree,jdbcType=INTEGER}, ",
        "#{answer,jdbcType=VARCHAR}, #{typeId,jdbcType=INTEGER}, ",
        "#{knowledgeId,jdbcType=INTEGER}, #{subjectId,jdbcType=INTEGER}, ",
        "#{chapterId,jdbcType=INTEGER}, #{body,jdbcType=LONGVARCHAR}, ",
        "#{analysis,jdbcType=LONGVARCHAR})"
    })
    int insert(QuestionWithBLOBs record);

    @InsertProvider(type=QuestionSqlProvider.class, method="insertSelective")
    int insertSelective(QuestionWithBLOBs record);

    @Select({
        "select",
        "id, author, add_date, degree, answer, type_id, knowledge_id, subject_id, chapter_id, ",
        "body, analysis",
        "from question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="author", property="author", jdbcType=JdbcType.INTEGER),
        @Result(column="add_date", property="addDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="degree", property="degree", jdbcType=JdbcType.INTEGER),
        @Result(column="answer", property="answer", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_id", property="typeId", jdbcType=JdbcType.INTEGER),
        @Result(column="knowledge_id", property="knowledgeId", jdbcType=JdbcType.INTEGER),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER),
        @Result(column="body", property="body", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="analysis", property="analysis", jdbcType=JdbcType.LONGVARCHAR)
    })
    QuestionWithBLOBs selectByPrimaryKey(Integer id);

    @UpdateProvider(type=QuestionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(QuestionWithBLOBs record);

    @Update({
        "update question",
        "set author = #{author,jdbcType=INTEGER},",
          "add_date = #{addDate,jdbcType=TIMESTAMP},",
          "degree = #{degree,jdbcType=INTEGER},",
          "answer = #{answer,jdbcType=VARCHAR},",
          "type_id = #{typeId,jdbcType=INTEGER},",
          "knowledge_id = #{knowledgeId,jdbcType=INTEGER},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "chapter_id = #{chapterId,jdbcType=INTEGER},",
          "body = #{body,jdbcType=LONGVARCHAR},",
          "analysis = #{analysis,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(QuestionWithBLOBs record);

    @Update({
        "update question",
        "set author = #{author,jdbcType=INTEGER},",
          "add_date = #{addDate,jdbcType=TIMESTAMP},",
          "degree = #{degree,jdbcType=INTEGER},",
          "answer = #{answer,jdbcType=VARCHAR},",
          "type_id = #{typeId,jdbcType=INTEGER},",
          "knowledge_id = #{knowledgeId,jdbcType=INTEGER},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "chapter_id = #{chapterId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Question record);
}