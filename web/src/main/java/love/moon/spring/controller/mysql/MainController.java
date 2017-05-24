package love.moon.spring.controller.mysql;

import love.moon.spring.model.User;
import love.moon.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by nadong on 2017/4/20.
 */
@Controller
@RequestMapping("/")
public class MainController {
    private Logger LOG = LoggerFactory.getLogger(MainController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String home(){
        return "index";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ResponseBody
    public List<User> user(){
        LOG.info("User...");
         return userService.getAllUsernames();
    }

}
