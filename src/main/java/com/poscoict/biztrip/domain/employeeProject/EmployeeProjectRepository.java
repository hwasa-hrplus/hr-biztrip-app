package com.poscoict.biztrip.domain.employeeProject;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, String> {

	Optional<EmployeeProject> findById(Long id);
}