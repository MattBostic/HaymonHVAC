package com.mb.HaymonHVAC.appointment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppointmentServiceImpTest {

    private static Appointment appointment;
    private List<Appointment> appointmentList;
    @Autowired
    private AppointmentServiceImp service;

    @BeforeAll
    static void setUp() {
        appointment = Appointment
                .builder()
                .date("Sep0921")
                .time("noon")
                .pmService(true)
                .diagnostic(false)
                .street("13801 Roslyn St")
                .build();
    }

    @Test
    public void persistAppointment(){
        service.persistAppointment(appointment);
        appointmentList = service.findAll();
        assertEquals(1, appointmentList.size(),"List size equals one");
        service.deleteById(appointmentList.get(0).getAppointmentId());
        assertEquals(0, service.findAll().size(), "Deleted saved record.");
    }

    @Test
    public void findByIfPmService(){
        service.persistAppointment(appointment);
        appointmentList = service.findByPmServiceTrue();
        var a = appointmentList.stream().findFirst();
        assertTrue(a.isPresent());
        assertTrue(a.get().isPmService());
        service.deleteById(appointmentList.get(0).getAppointmentId());
    }


}