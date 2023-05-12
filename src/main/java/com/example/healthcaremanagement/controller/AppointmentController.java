package com.example.healthcaremanagement.controller;

import com.example.healthcaremanagement.entity.Appointment;
import com.example.healthcaremanagement.entity.Doctor;
import com.example.healthcaremanagement.entity.Patient;
import com.example.healthcaremanagement.repository.AppointmentsRepository;
import com.example.healthcaremanagement.repository.DoctorRepository;
import com.example.healthcaremanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class AppointmentController {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private AppointmentsRepository appointmentsRepository;
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/appointments")
    public String appointmentPage(ModelMap modelMap) {
        List<Appointment> all = appointmentsRepository.findAll();
        modelMap.addAttribute("appointments", all);
        return "appointments";
    }

    @GetMapping("/appointments/add")
    public String addAppointmentsPage(ModelMap modelMap) {
        List<Doctor> all = doctorRepository.findAll();
        List<Patient> all1 = patientRepository.findAll();
        modelMap.addAttribute("doctors",all);
        modelMap.addAttribute("patients",all1);
        return "addAppointments";
    }


    @PostMapping("/appointments/add")
    public String addAppointments(@ModelAttribute Appointment appointment) {
        appointmentsRepository.save(appointment);
        return "redirect:/appointments";
    }

    @GetMapping("/appointments/remove")
    public String removePatient(@RequestParam("id") int id) {
        appointmentsRepository.deleteById(id);
        return "redirect:/appointments";
    }
}
