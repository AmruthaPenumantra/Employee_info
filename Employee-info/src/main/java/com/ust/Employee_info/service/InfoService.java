package com.ust.Employee_info.service;

import com.ust.Employee_info.model.Employee_info;
import com.ust.Employee_info.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
    @Autowired

    private InfoRepository infoRepository;

    public Employee_info addInfo(Employee_info employeeInfo) {
        return infoRepository.save(employeeInfo);
    }
}
