package com.mb.HaymonHVAC.appointment;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long appointmentId;

    String date;
    String time;
    String street;

    boolean pmService;
    boolean diagnostic;

}
