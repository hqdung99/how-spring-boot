/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.service.impl;

import org.example.dom.User;
import org.example.enums.UserStatus;
import org.example.repositoriy.IUserRepository;
import org.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @author Huynh Quoc Dung
 */
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    public Optional<User> findValidUser(final long userId) {
        return userRepository.findByIdAndStatus(userId, UserStatus.NEW);
    }
}
