package com.poscoict.biztrip.web.dto;

import com.poscoict.biztrip.domain.bizpurpose.BizPurpose;

import lombok.Getter;

@Getter
public class BizPurposeResponseDto {
	private String code;	
	private String name;
	
	public BizPurposeResponseDto(BizPurpose entity) {
		this.code = entity.getCode();
		this.name = entity.getName();
	}
}
