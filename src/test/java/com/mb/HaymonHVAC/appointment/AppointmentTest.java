package com.mb.HaymonHVAC.appointment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AppointmentTest {

    private static Appointment appointment;
    @Autowired
    private AppointmentRepo appointmentRepo;

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
    public void createAppointment(){
        appointmentRepo.save(appointment);
        Assertions.assertNotNull(appointmentRepo.findAll());
    }
}