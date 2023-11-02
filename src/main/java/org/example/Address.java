package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    public int id;
    public String street;
    public String city;
    @OneToOne(mappedBy = "address")
    public User user;


}
