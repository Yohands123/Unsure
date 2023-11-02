package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String username;
    public String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
     public Address address;


}
