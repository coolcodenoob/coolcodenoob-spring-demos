package top.coolcodenoob.hellworldmvc.dao;

import org.springframework.stereotype.Repository;
import top.coolcodenoob.hellworldmvc.entity.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userList = new ArrayList<>();

    public void save(User user) {
        userList.add(user);
    }

    public List<User> findAll() {
        return userList;
    }
}
