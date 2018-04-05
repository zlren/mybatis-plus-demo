package lab.zlren.mp.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import lab.zlren.mp.entity.User;
import lab.zlren.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zlren
 * @date 2017-11-12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<User> getAllUser() {
        return userService.selectList(new EntityWrapper<>());
    }
}
