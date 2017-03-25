package com.homestay.repository;

import com.homestay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 慧慧姐 on 2017/3/24.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByAccount(String account);
}
