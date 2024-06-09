package com.ust.Employee_info.repository;

import com.ust.Employee_info.model.Employee_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends JpaRepository<Employee_info,Integer> {


}
