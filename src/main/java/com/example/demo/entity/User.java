package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

}
