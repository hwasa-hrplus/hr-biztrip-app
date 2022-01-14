package com.poscoict.biztrip.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.biztrip.domain.bizpurpose.BizPurpose;
import com.poscoict.biztrip.service.BizPurposeService;
import com.poscoict.biztrip.service.ProjectService;
import com.poscoict.biztrip.web.dto.BizPurposeResponseDto;
import com.poscoict.biztrip.web.dto.ProjectResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BizPurposeController {
	private final BizPurposeService bizPurposeService;
	
	@GetMapping("/bizpurpose/list")
    public List<BizPurposeResponseDto> findByAll(){
        return bizPurposeService.findAll();
    }
}
