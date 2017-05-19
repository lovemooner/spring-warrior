package love.moon.spring.service;

import love.moon.spring.dao.UserDAO;
import love.moon.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nadong on 2017/4/20.
 */
@Transactional
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    public void saveUsers(List<User> us) {
        for (User u : us) {
            userDao.save(u);
        }
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void test(){

    }

    public List<User> getAllUsernames() {
        return userDao.findAll();
    }
}