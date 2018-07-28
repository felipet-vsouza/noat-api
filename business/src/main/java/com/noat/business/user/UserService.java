package com.noat.business.user;

import com.noat.data.repository.UserRepository;
import com.noat.data.representarion.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findUser(String username) {
        return repository.findByUsername(username);
    }
}
