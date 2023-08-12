package com.in28minutes.learnspringboot.user.service;

import com.in28minutes.learnspringboot.user.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
