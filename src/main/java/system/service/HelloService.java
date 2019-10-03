package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.HelloDao;
import system.model.Title;

@Service
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public Title getHelloModel() {
        return helloDao.getHelloModel();
    }

    public boolean updateModel(Title title){
        return helloDao.update(title);
    }
}
