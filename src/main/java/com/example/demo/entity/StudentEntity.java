package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
public class StudentEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Notblank
    private String name;
    @email
    @(Notnull=false)
    private String email;
    private float cgpa;

    // public StudentEntity(Long id, String name, String email, float cgpa) {
    //     this.id = id;
    //     this.name = name;
    //     this.email = email;
    //     this.cgpa = cgpa;
    // }

    // public StudentEntity() {
        
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getName() {
    //     return this.name;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    // public String getEmail() {
    //     return this.email;
    // }

    // public void setCgpa(float cgpa) {
    //     this.cgpa = cgpa;
    // }

    // public float getCgpa() {
    //     return this.cgpa;
    // }
}