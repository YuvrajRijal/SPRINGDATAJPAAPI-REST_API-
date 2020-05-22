package com.yuvi.springboot.myrestapi.HibernateDAO;

import com.yuvi.springboot.myrestapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJPA extends JpaRepository<Employee,Integer> {

    

}
