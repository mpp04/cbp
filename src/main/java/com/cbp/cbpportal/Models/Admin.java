package com.cbp.cbpportal.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="cbpadmin")
public class Admin implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Getter @Setter
    Integer id;

    @Getter
    @Setter
    @Column(name="username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name= "firstname")
    private String firstname;

    @Column(name= "lastname")
    private  String lastname;


    @Getter
    @Setter
    UUID uuid;
}