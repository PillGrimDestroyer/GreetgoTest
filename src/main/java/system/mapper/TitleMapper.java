package system.mapper;

import org.apache.ibatis.annotations.*;
import system.model.Title;

@Mapper
public interface TitleMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "message", column = "message")
    })
    @Select("SELECT * FROM Titles LIMIT 1")
    Title getTitle();

    @Update("UPDATE Titles SET message=#{message} WHERE id=#{id}")
    void update(Title title);
}
