package com.cbp.cbpportal.Models;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name="importers")
public class Importers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Length(max=8)
    private String username;

    @Length(max=50)
    private String company_name;

    @Length(max=10)
    private String phone;

    @Length(max=20)
    private Integer cbpo_id;







}
