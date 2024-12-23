package com.example.suza.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    

    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private String address;
    private Long zid;
    private String phoneNumber;
    private String email;
    
    // Employee(){

    // }

    // Employee(
    // String employeeId,
    // String firstName,
    // String lastName,
    // String department,
    // String address,
    // int zid,
    // String phoneNumber,
    // String email ){
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.address = address;
    //     this.phoneNumber = phoneNumber;
    //     this.department = department;
    //     this.zid = zid;
    //     this.email = email;
    // }

    // void setFirstName(  String firstName){
    //     this.firstName = firstName;
    // }

    // String getFirstName(){
    //     return firstName;
    // }

}
