package com.poscoict.biztrip.web.dto;

import com.poscoict.biztrip.domain.employeeProject.EmployeeProject;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class EmployeeProjectDto {
	private String code;
	private Long id;

	public EmployeeProjectDto(EmployeeProject entity) {
		this.code = entity.getCode();
		this.id = entity.getId();
	}

	public EmployeeProject toEntity() {
		return EmployeeProject.builder().code(code).id(id).build();
	}
}
