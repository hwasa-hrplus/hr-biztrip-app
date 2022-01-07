package com.poscoict.biztrip.domain.project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {
	Project findByName(String name);
}