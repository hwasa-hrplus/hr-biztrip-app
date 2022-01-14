package com.poscoict.biztrip.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.biztrip.service.EmployeeProjectService;
import com.poscoict.biztrip.web.dto.EmployeeProjectDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmployeeProjectApiController {
	private final EmployeeProjectService epService;
	
	//지수
	// employeeProject insert
	@PostMapping("/project/insert")
    public Long save(@RequestBody EmployeeProjectDto epDto){
		  return epService.save(epDto);
    }
}
