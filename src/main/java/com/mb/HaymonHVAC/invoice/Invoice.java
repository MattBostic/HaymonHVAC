package com.mb.HaymonHVAC.invoice;

import com.mb.HaymonHVAC.address.Address;
import com.mb.HaymonHVAC.appointment.Appointment;
import com.mb.HaymonHVAC.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id")
    private long id;

    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Address address;

    @Column(name = "address_id")
    private long addressId;


    @JoinColumn(name = "appointment_id", insertable = false, updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Appointment appointment;

    @Column(name = "appointment_id")
    private long appointment_id;


    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;

    @Column(name = "customer_id")
    private long customer_id;

}
