package com.poscoict.biztrip.web.dto;

import java.util.Date;

import com.poscoict.biztrip.domain.biztrip.BizTrip;

import lombok.Getter;

@Getter
public class BizTripResponseDto {
	private Long id;
    private String bizPurposeName;
    private String companyName;
    private String location;
    private Date start_date;
    private Date end_date;
    private String progress;
    private Long bossId;
    private String projectName;
    private boolean approved;
    
    public BizTripResponseDto(BizTrip entity) {
		this.id = entity.getId();
		this.bizPurposeName = entity.getBizPurpose().getName();
		this.companyName = entity.getCompanyName();
		this.location = entity.getLocation();
		this.start_date = entity.getStartDate();
		this.end_date = entity.getEndDate();
		this.progress = entity.getProgress();
		this.bossId = entity.getBossId();
		this.projectName = entity.getProject().getName();
		this.approved = entity.isApproved();
	}
}
