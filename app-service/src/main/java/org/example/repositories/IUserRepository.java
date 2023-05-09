/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.repositories;

import org.example.dom.User;
import org.example.dom.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Huynh Quoc Dung
 */
public interface IUserRepository extends JpaRepository<User, Long> {


    List<User> findByStatusIsNot(UserStatus status);

    Optional<User> findByIdAndStatus(long userId, UserStatus aNew);
}
