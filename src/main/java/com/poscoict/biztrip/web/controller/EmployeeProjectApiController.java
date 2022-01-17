package com.poscoict.biztrip.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.biztrip.service.EmployeeProjectService;
import com.poscoict.biztrip.web.dto.BizTripResponseDto;
import com.poscoict.biztrip.web.dto.EmployeeProjectDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmployeeProjectApiController {
	private final EmployeeProjectService epService;
	
	//@지수
	// employeeProject insert
	@PostMapping("/project/insert")
    public Long save(@RequestBody EmployeeProjectDto epDto){
		  return epService.save(epDto);
    }
	
	//@지수
	// employeeProject select
	@GetMapping("/project/{id}")
    public EmployeeProjectDto getProjectById(@PathVariable Long id){
		  return epService.getProjectById(id);
    }
	
	@GetMapping("/project/employee")
    public List<EmployeeProjectDto> getAll(){
		  return epService.findAll();
    }
	
	//@지수
	// employeeProject select
	@PutMapping("/project/{id}")
	public Long UpdateProjectById(@PathVariable Long id, @RequestBody EmployeeProjectDto epDto){
		 return epService.updateProjectById(id, epDto);
	}
	
	// @지수
	// employeeProject delete
	@DeleteMapping("/project/{id}")
	public Long deleteProjectById(@PathVariable Long id) {
		epService.deleteProjectById(id);
		return id;
	}

}
