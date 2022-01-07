package com.poscoict.biztrip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poscoict.biztrip.domain.bizpurpose.BizPurpose;
import com.poscoict.biztrip.domain.bizpurpose.BizPurposeRepository;
import com.poscoict.biztrip.domain.biztrip.BizTrip;
import com.poscoict.biztrip.domain.biztrip.BizTripRepository;
import com.poscoict.biztrip.domain.project.Project;
import com.poscoict.biztrip.domain.project.ProjectRepository;
import com.poscoict.biztrip.web.dto.BizTripResponseDto;
import com.poscoict.biztrip.web.dto.BizTripSaveRequestDto;
import com.poscoict.biztrip.web.dto.BizTripUpdateRequestDto;
import com.poscoict.biztrip.web.dto.ProjectResponseDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // @Autowired 없이 생성자로 주입하는 방식
//final이 선언된 필드를 인자값으로 하는 생성자를 생성함
@Service
public class ProjectService {
	private final ProjectRepository projectRepository;
	
	@Transactional(readOnly = true) // 등록,수정,삭제 기능이 전혀 없는 서비스에서 조회 속도를 개선할 수 있음
	public List<ProjectResponseDto> findAll() {
		return projectRepository.findAll().stream().map(ProjectResponseDto::new).collect(Collectors.toList());
	}
}
