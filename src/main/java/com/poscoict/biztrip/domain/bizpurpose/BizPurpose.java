package com.poscoict.biztrip.domain.bizpurpose;

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
@Table(name = "biz_purpose")
public class BizPurpose {	
	@Id
	@Column(name = "code", nullable = false)	
	private String code;
		
	@Column(name = "name")
	private String name;

	
	@Builder
	public BizPurpose(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}	
}
