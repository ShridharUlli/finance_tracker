package com.finance.server.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // <== add this to avoid reserved keyword
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // getters and setters
}
