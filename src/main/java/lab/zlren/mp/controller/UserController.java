package lab.zlren.mp.controller;

import lab.zlren.mp.entity.User;
import lab.zlren.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlren
 * @date 2017-11-12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String getAllUser() {
        // EntityWrapper<User> ew = new EntityWrapper<>();
        // ew.between("age", 1, 2);
        // ew.orderBy("age");
        // ew.in("name", "雷锋,三毛");
        // ew.lt("", "");
        // return userService.selectList(ew);

        User user = new User();
        user.setUsername("zlren");
        userService.insert(user);

        return "hello";
    }
}
