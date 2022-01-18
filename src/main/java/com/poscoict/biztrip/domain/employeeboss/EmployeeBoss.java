package com.poscoict.biztrip.domain.employeeboss;

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
@Table(name = "employee_boss")
public class EmployeeBoss {	
	
	@Id
	@Column(name = "id", nullable = false)	
	private Long id;	
	
	@Column(name = "bid")
	private Long bid;

	
	@Builder
	public EmployeeBoss(Long id, Long bid) {
		super();
		this.id = id;
		this.bid = bid;
	}


	@Override
	public String toString() {
		return "EmployeeBoss [id=" + id + ", bid=" + bid + "]";
	}
	
	
}
