package com.example.healthcaremanagement.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@TableGenerator(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
}
