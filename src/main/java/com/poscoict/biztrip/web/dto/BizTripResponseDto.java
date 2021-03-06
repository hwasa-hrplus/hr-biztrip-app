package com.poscoict.biztrip.web.dto;

import java.util.Date;

import com.poscoict.biztrip.domain.bizpurpose.BizPurpose;
import com.poscoict.biztrip.domain.biztrip.BizTrip;
import com.poscoict.biztrip.domain.project.Project;

import lombok.Getter;

@Getter
public class BizTripResponseDto {
	private Long id;
    private BizPurpose bizPurpose;
    private String companyName;
    private String location;
    private Date startDate;
    private Date endDate;
    private Long bossId;
    private Project project;
    private boolean approved;
    private Long employeeId;
    
    public BizTripResponseDto(BizTrip entity) {
		this.id = entity.getId();
		this.bizPurpose = entity.getBizPurpose();
		this.companyName = entity.getCompanyName();
		this.location = entity.getLocation();
		this.startDate = entity.getStartDate();
		this.endDate = entity.getEndDate();
		this.bossId = entity.getBossId();
		this.project = entity.getProject();
		this.approved = entity.isApproved();
		this.employeeId = entity.getEmployeeId();
	}
}
