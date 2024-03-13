package top.coolcodenoob.hellworldmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.coolcodenoob.hellworldmvc.dao.UserRepository;
import top.coolcodenoob.hellworldmvc.entity.User;
import top.coolcodenoob.hellworldmvc.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userDao;


    /**
     *
     * @param user 用户
     */
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    /**
     *
     * @return user list
     */
    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
