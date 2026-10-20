package com.fitness.UserService.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    private String  firstName;
    private String  lastName;

    @Enumerated(EnumType.STRING)
    private  UserRole role = UserRole.USER ;

    @CreationTimestamp
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
  }
