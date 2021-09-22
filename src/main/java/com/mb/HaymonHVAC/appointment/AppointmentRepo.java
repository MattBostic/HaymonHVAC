package com.mb.HaymonHVAC.appointment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

    void deleteById(Long id);

    List<Appointment> findAll();

    List<Appointment> findByStreet(String address);

    List<Appointment> findByDate(String date);

    List<Appointment> findByTime(String time);

    List<Appointment> findByPmServiceTrue();

    List<Appointment> findByDiagnosticTrue();
}
