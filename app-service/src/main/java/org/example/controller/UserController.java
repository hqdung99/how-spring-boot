/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.controller;

import org.example.api.UsersApi;
import org.example.enums.UserStatus;
import org.example.model.User;
import org.example.repositoriy.IUserRepository;
import org.example.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Huynh Quoc Dung
 */
@Controller
public class UserController implements UsersApi {

    @Autowired
    private IUserRepository userRepository;
    private UserService userService;

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(
                userRepository.findByStatusIsNot(UserStatus.DELETED)
                .stream()
                .map(user -> {
                    User returnUser = new User();
                    returnUser.setEmail(user.getEmail());
                    returnUser.setFirstName(user.getFirstName());
                    returnUser.setLastName(user.getLastName());
                    returnUser.setId(Long.valueOf(user.getId()));

                    return returnUser;
                })
                .collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        org.example.dom.User domUser = new org.example.dom.User();
        domUser.setEmail(user.getEmail());
        domUser.setFirstName(user.getFirstName());
        domUser.setLastName(user.getLastName());
        domUser.setStatus(UserStatus.NEW);

        org.example.dom.User savedUser = userRepository.save(domUser);
        user.setId(Long.valueOf(savedUser.getId()));

        return ResponseEntity.ok(user);
    }

}
