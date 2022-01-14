package com.poscoict.biztrip.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.biztrip.service.ProjectService;
import com.poscoict.biztrip.web.dto.ProjectResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ProjectApiController {
	private final ProjectService projectService;
	
	@GetMapping("/project/list")
    public List<ProjectResponseDto> findByAll(){
        return projectService.findAll();
    }
}
