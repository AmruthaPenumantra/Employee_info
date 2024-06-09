package com.ust.Employee_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee_info {
    @Id
    @GeneratedValue

    private int emp_id;

    private String emp_name;

    private String basic_salary;

    private char grade;


}
