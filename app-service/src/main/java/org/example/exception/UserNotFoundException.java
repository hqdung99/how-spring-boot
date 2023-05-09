/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Huynh Quoc Dung
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    private int user_id;

    public UserNotFoundException(long user_id) {
        super(String.format("User is not found with id: '%s", user_id));
    }

    public UserNotFoundException(String message) {
        super(message);
    }

}
