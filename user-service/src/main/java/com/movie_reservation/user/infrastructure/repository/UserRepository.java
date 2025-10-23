package com.movie_reservation.user.infrastructure.repository;

import com.movie_reservation.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
