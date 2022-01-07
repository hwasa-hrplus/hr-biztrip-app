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
public class BizTripService {
	private final BizTripRepository bizTripRepository;
	private final BizPurposeRepository bizPurposeRepository;
	private final ProjectRepository projectRepository;

	public BizTripResponseDto findById(Long id) {
		BizTrip entity = bizTripRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 출장정보가 없습니다. id=" + id));

		return new BizTripResponseDto(entity);
	}

	@Transactional(readOnly = true) // 등록,수정,삭제 기능이 전혀 없는 서비스에서 조회 속도를 개선할 수 있음
	public List<BizTripResponseDto> findAll() {
		return bizTripRepository.findAll().stream().map(BizTripResponseDto::new).collect(Collectors.toList());
	}

	@Transactional
	public void delete(Long id) {
		BizTrip entity = bizTripRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 출장정보가 없습니다. id=" + id));
		// postsById 메소드를 활용하면 id로 삭제할 수도 있음
		bizTripRepository.delete(entity);
	}

	@Transactional
	public Long save(BizTripSaveRequestDto requestDto) {
		BizPurpose bizPurpose = bizPurposeRepository.findByName(requestDto.getBizPurposeName());
		Project project = projectRepository.findByName(requestDto.getProjectName());
		return bizTripRepository.save(requestDto.toEntity(bizPurpose, project)).getId();// DTO 객체를 Entity로 매핑해서
																						// Repository에서 처리하기
	}

	@Transactional
	public Long update(Long id, BizTripUpdateRequestDto requestDto) {
		BizTrip entity = bizTripRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("해당 출장정보가 없습니다. id=" + id));
		entity.update(requestDto.isApproved());// 영속성 컨텍스트 엔티티 영구저장
		return id;
	}

}
