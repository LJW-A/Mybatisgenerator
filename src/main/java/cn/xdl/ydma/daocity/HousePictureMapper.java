package cn.xdl.ydma.daocity;

import cn.xdl.ydma.entitycity.HousePicture;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface HousePictureMapper {
    @Delete({
        "delete from house_picture",
        "where housePictureId = #{housepictureid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer housepictureid);

    @Insert({
        "insert into house_picture (housePictureId, houseId, ",
        "cdnPrefix, width, ",
        "height, location, ",
        "path)",
        "values (#{housepictureid,jdbcType=INTEGER}, #{houseid,jdbcType=INTEGER}, ",
        "#{cdnprefix,jdbcType=VARCHAR}, #{width,jdbcType=INTEGER}, ",
        "#{height,jdbcType=INTEGER}, #{location,jdbcType=VARCHAR}, ",
        "#{path,jdbcType=VARCHAR})"
    })
    int insert(HousePicture record);

    @InsertProvider(type=HousePictureSqlProvider.class, method="insertSelective")
    int insertSelective(HousePicture record);

    @Select({
        "select",
        "housePictureId, houseId, cdnPrefix, width, height, location, path",
        "from house_picture",
        "where housePictureId = #{housepictureid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="housePictureId", property="housepictureid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="houseId", property="houseid", jdbcType=JdbcType.INTEGER),
        @Result(column="cdnPrefix", property="cdnprefix", jdbcType=JdbcType.VARCHAR),
        @Result(column="width", property="width", jdbcType=JdbcType.INTEGER),
        @Result(column="height", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="path", property="path", jdbcType=JdbcType.VARCHAR)
    })
    HousePicture selectByPrimaryKey(Integer housepictureid);

    @UpdateProvider(type=HousePictureSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HousePicture record);

    @Update({
        "update house_picture",
        "set houseId = #{houseid,jdbcType=INTEGER},",
          "cdnPrefix = #{cdnprefix,jdbcType=VARCHAR},",
          "width = #{width,jdbcType=INTEGER},",
          "height = #{height,jdbcType=INTEGER},",
          "location = #{location,jdbcType=VARCHAR},",
          "path = #{path,jdbcType=VARCHAR}",
        "where housePictureId = #{housepictureid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(HousePicture record);
}