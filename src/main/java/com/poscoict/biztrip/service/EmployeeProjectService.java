package com.poscoict.biztrip.service;

import org.springframework.stereotype.Service;

import com.poscoict.biztrip.domain.employeeProject.EmployeeProjectRepository;
import com.poscoict.biztrip.web.dto.EmployeeProjectDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // @Autowired 없이 생성자로 주입하는 방식
//final이 선언된 필드를 인자값으로 하는 생성자를 생성함
@Service
public class EmployeeProjectService {

	private final EmployeeProjectRepository employeeProjectRepository;
	
	public Long save(EmployeeProjectDto employeeProjectDto) {
		return employeeProjectRepository.save(employeeProjectDto.toEntity()).getId();
	}
	

}
