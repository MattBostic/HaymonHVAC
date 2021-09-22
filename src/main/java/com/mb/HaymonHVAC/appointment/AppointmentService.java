package com.mb.HaymonHVAC.appointment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AppointmentService {
    void persistAppointment(Appointment appointment);
    List<Appointment> findByStreet(String street);
    List<Appointment> findByDate(String date);
    List<Appointment> findByTime(String time);
    List<Appointment> findByPmServiceTrue();
    List<Appointment> findByDiagnosticTrue();


    void deleteById(Long appointmentId);
}
