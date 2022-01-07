package com.poscoict.biztrip.domain.biztrip;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.poscoict.biztrip.domain.bizpurpose.BizPurpose;
import com.poscoict.biztrip.domain.project.Project;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "biz_trip")
public class BizTrip {	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "progress")
	private String progress;
	
	@Column(name = "boss_id")
	private Long bossId;
	
	@Column(name = "approved")
	private boolean approved;
	
	@ManyToOne
	@JoinColumn(name = "biz_purpose_code")
	private BizPurpose bizPurpose;
	
	@ManyToOne
	@JoinColumn(name = "project_code")
	private Project project;

	@Builder
	public BizTrip(Long id, String companyName, String location, Date startDate, Date endDate, String progress,
			Long bossId, boolean approved, BizPurpose bizPurpose, Project project) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.progress = progress;
		this.bossId = bossId;
		this.approved = approved;
		this.bizPurpose = bizPurpose;
		this.project = project;
	}
	
	public void update(boolean approved) {
        this.approved = approved;
    }
}
