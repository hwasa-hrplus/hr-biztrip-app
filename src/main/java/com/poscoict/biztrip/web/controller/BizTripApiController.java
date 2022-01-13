package com.poscoict.biztrip.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.biztrip.service.BizTripService;
import com.poscoict.biztrip.service.ProjectService;
import com.poscoict.biztrip.web.dto.BizTripResponseDto;
import com.poscoict.biztrip.web.dto.BizTripSaveRequestDto;
import com.poscoict.biztrip.web.dto.BizTripUpdateRequestDto;
import com.poscoict.biztrip.web.dto.ProjectResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BizTripApiController {
	private final BizTripService bizTripService;
	
	@GetMapping("/{id}")
    public BizTripResponseDto findById(@PathVariable Long id){
        return bizTripService.findById(id);
    }
	
	@GetMapping("/list")
    public List<BizTripResponseDto> findAll(){
        return bizTripService.findAll();
    }
	
	
	@GetMapping("/employee/{employeeId}")
	 public List<BizTripResponseDto> findByEmployeeId(@PathVariable Long employeeId){
        return bizTripService.findByEmployeeId(employeeId);
    }
	
	@DeleteMapping("/{id}")
    public Long delete(@PathVariable Long id){
		bizTripService.delete(id);
        return id;
    }
	
	@PostMapping("/")
    public Long save(@RequestBody BizTripSaveRequestDto requestDto){
        return bizTripService.save(requestDto);
    }
	
	@PutMapping("/{id}")
    public Long update(@PathVariable Long id, @RequestBody BizTripUpdateRequestDto requestDto){
        return bizTripService.update(id, requestDto);
    }
}
