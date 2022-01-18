package com.poscoict.biztrip.web.dto;

import com.poscoict.biztrip.domain.employeeboss.EmployeeBoss;

public class EmployeeBossResponseDto {
	private Long id;	
	private Long bid;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}
	
	public EmployeeBossResponseDto(Long id, Long bid) {
		super();
		this.id = id;
		this.bid = bid;
	}

	public EmployeeBossResponseDto(EmployeeBoss entity) {
		this.id = entity.getId();
		this.bid = entity.getBid();
	}
	
	public EmployeeBoss toEntity() {
		return EmployeeBoss.builder().id(bid).bid(bid).build();
	}
}
