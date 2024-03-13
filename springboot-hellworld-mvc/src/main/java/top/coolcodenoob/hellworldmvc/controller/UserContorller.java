package top.coolcodenoob.hellworldmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.coolcodenoob.hellworldmvc.entity.User;
import top.coolcodenoob.hellworldmvc.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContorller {
    @Autowired
    private UserService userService;

    /**
     * http://localhost:8080/user/add
     *
     * @param user 用户
     * @return user 用户
     */
    @PostMapping("add")
    public User add(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }

    /**
     * http://localhost:8080/user/list
     *
     * @return user list
     */
    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }
}
