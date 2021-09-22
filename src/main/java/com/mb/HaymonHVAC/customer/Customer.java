package com.mb.HaymonHVAC.customer;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    Long customerId;
    String firstName;
    String lastName;
    String email;
}
