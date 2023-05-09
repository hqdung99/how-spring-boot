/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.controller;

import org.example.api.UsersApi;
import org.example.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author Huynh Quoc Dung
 */
@Controller
public class UserController implements UsersApi {

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        return UsersApi.super.getAllUsers();
    }
}
