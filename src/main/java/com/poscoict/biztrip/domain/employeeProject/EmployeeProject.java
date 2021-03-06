package com.poscoict.biztrip.domain.employeeProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "employee_project")
public class EmployeeProject {	
	
	@Column(name = "code", nullable = false)	
	private String code;
	
	@Id
	@Column(name = "id")
	private Long id;

	
	@Builder
	public EmployeeProject(String code, Long id) {
		super();
		this.code = code;
		this.id = id;
	}


	public void updateProject(String code, Long id) {
		this.id = id;
		this.code = code;
		
	}	
}
