package love.moon.spring.service;

import love.moon.spring.model.User;

import java.util.List;

/**
 * Created by nadong on 2017/4/20.
 */
public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();
}
