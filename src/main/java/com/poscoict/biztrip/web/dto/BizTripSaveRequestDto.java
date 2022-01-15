package com.poscoict.biztrip.web.dto;

import java.util.Date;

import com.poscoict.biztrip.domain.bizpurpose.BizPurpose;
import com.poscoict.biztrip.domain.biztrip.BizTrip;
import com.poscoict.biztrip.domain.project.Project;

import lombok.Getter;

@Getter
public class BizTripSaveRequestDto {
    private String companyName;
    private String location;
    private Date startDate;
    private Date endDate;
    private Long bossId;
    private boolean approved;
    private String bizPurposeName;
    private String projectName;
    private Long employeeId;
    
    public BizTrip toEntity(BizPurpose bizPurpose, Project project){
    	return BizTrip.builder()
			.companyName(companyName)
			.location(location)
			.startDate(startDate)
			.endDate(endDate)
			.bossId(bossId)
			.approved(false)
			.bizPurpose(bizPurpose)
			.project(project)
			.employeeId(employeeId)
			.build();
    }
}
