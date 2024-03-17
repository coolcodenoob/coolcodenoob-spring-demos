package top.coolcodenoob.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.coolcodenoob.h2.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
