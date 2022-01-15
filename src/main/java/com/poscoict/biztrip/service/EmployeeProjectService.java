package com.poscoict.biztrip.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poscoict.biztrip.domain.employeeProject.EmployeeProject;
import com.poscoict.biztrip.domain.employeeProject.EmployeeProjectRepository;
import com.poscoict.biztrip.web.dto.EmployeeProjectDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // @Autowired 없이 생성자로 주입하는 방식
//final이 선언된 필드를 인자값으로 하는 생성자를 생성함
@Service
public class EmployeeProjectService {

	private final EmployeeProjectRepository employeeProjectRepository;
	
	@Transactional
	public Long save(EmployeeProjectDto employeeProjectDto) {
		return employeeProjectRepository.save(employeeProjectDto.toEntity()).getId();
	}

	public EmployeeProjectDto getProjectById(Long id) {
		EmployeeProject entity = employeeProjectRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 사용자정보가 없습니다. id=" + id));

		return new EmployeeProjectDto(entity);
	}
	
	@Transactional
	public void deleteProjectById(Long id) {
		EmployeeProject entity = employeeProjectRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 사용자 정보가 없습니다. id=" + id));
		employeeProjectRepository.delete(entity);
		
	}

	@Transactional
	public Long updateProjectById(Long id, EmployeeProjectDto epDto) {
		EmployeeProject entity = employeeProjectRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 사용자 업데이트 정보가 없습니다.(for bizTrip) id=" + id));
		
		entity.updateProject(epDto.getCode(),epDto.getId());
		
		return id;
	}
	

}
