package com.poscoict.biztrip.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BizTripUpdateRequestDto {
    private boolean approved;
    
    @Builder
	public BizTripUpdateRequestDto(boolean approved) {
		this.approved = approved;
	}
}
