package com.example.healthcaremanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@TableGenerator(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;
    private String email;
    private String specialty;
    private String phoneNumber;
    private String profilePic;

}
