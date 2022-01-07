package com.poscoict.biztrip.web.dto;

import com.poscoict.biztrip.domain.project.Project;

import lombok.Getter;

@Getter
public class ProjectResponseDto {
	private String code;	
	private String name;
	private String costCenter;
	
	public ProjectResponseDto(Project entity) {
		this.code = entity.getCode();
		this.name = entity.getName();
		this.costCenter = entity.getCostCenter();
	}
}
