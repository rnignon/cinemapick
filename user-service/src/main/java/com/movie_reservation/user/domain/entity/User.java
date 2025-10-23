package com.movie_reservation.user.domain.entity;

import com.movie_reservation.user.domain.enums.UserRole;
import entity.BaseAuditableEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User extends BaseAuditableEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "role", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "username", nullable = false, updatable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @Column(name = "nickname")
    private String nickname;

    public User(UserRole role, String username, String password, String email, String phoneNumber) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void updatePassword(String newPassword) {
        this.password = newPassword;
    }

    public void updateInfo(String email, String phoneNumber, String nickname) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nickname = nickname;
    }
}
