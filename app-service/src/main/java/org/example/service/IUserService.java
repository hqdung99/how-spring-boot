/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.service;

import org.example.dom.User;

import java.util.Optional;

/**
 * @author Huynh Quoc Dung
 */
public interface IUserService {
    Optional<User> findValidUser(long userId);
}
