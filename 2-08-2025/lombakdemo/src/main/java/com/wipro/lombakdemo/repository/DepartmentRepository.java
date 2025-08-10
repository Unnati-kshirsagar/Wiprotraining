package com.wipro.lombakdemo.repository;

import com.wipro.lombakdemo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
