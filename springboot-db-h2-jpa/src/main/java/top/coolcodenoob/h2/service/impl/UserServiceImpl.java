package top.coolcodenoob.h2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.coolcodenoob.h2.dao.UserRepository;
import top.coolcodenoob.h2.entity.User;
import top.coolcodenoob.h2.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userDao;

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
