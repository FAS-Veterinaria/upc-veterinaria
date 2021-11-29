package com.example.veterinaria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Date {
    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private String doctor;
    private String type;
    private String room;
}
