package com.example.healthcaremanagement.repository;

import com.example.healthcaremanagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentsRepository extends JpaRepository<Appointment, Integer> {
}
