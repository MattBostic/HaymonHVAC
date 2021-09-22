package com.mb.HaymonHVAC.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImp implements AppointmentService{
    @Autowired
    private AppointmentRepo repo;

    @Override
    public void persistAppointment(Appointment appointment) {
        repo.save(appointment);
    }

    @Override
    public void deleteById(Long appointmentId) {
        repo.deleteById(appointmentId);
    }

    @Override
    public List<Appointment> findByStreet(String street) {
        return repo.findByStreet(street);
    }

    @Override
    public List<Appointment> findByDate(String date) {
        return repo.findByDate(date);
    }

    @Override
    public List<Appointment> findByTime(String time) {
        return repo.findByTime(time);
    }

    @Override
    public List<Appointment> findByPmServiceTrue() {
        return repo.findByPmServiceTrue();
    }

    @Override
    public List<Appointment> findByDiagnosticTrue() {
        return repo.findByDiagnosticTrue();
    }

    public List<Appointment> findAll() {
        return repo.findAll();
    }
}
