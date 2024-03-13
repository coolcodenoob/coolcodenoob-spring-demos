package top.coolcodenoob.hellworldmvc.service;

import top.coolcodenoob.hellworldmvc.entity.User;

import java.util.List;

public interface UserService {
    /**
     *
     * @param user 用户
     */
    void addUser(User user);

    /**
     *
     * @return user list
     */
    List<User> list();
}
