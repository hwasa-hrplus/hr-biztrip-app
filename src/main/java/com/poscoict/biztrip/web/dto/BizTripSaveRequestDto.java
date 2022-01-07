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
    private String progress;
    private Long bossId;
    private boolean approved;
    private String bizPurposeName;
    private String projectName;
    
    public BizTrip toEntity(BizPurpose bizPurpose, Project project){
    	return BizTrip.builder()
			.companyName(companyName)
			.location(location)
			.startDate(startDate)
			.endDate(endDate)
			.progress(progress)
			.bossId(bossId)
			.approved(approved)
			.bizPurpose(bizPurpose)
			.project(project)
			.build();    	
    }
}
