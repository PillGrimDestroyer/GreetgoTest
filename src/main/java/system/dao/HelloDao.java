package system.dao;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import system.mapper.TitleMapper;
import system.model.Title;

@Repository
public class HelloDao {

    @Autowired
    private TitleMapper titleMapper;

    public Title getHelloModel() {
        return titleMapper.getTitle();
    }

    public boolean update(Title title) {
        try {
            titleMapper.update(title);
        }
        catch (Exception ex){
            return  false;
        }

        return true;
    }
}
