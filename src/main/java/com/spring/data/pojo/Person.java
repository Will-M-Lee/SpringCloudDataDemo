package com.spring.data.pojo;

import lombok.Data;

import javax.persistence.*;


/**
 * Created by Will on 2017/10/17.
 */

@Data
@Entity
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

}
