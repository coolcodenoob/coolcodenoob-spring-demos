package top.coolcodenoob.h2.service;

import top.coolcodenoob.h2.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> list();
}
