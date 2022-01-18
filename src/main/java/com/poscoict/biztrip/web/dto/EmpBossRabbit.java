package com.poscoict.biztrip.web.dto;

public class EmpBossRabbit {
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
	@Override
	public String toString() {
		return "EmpBossRabbit [id=" + id + ", bid=" + bid + "]";
	}	
	
}
