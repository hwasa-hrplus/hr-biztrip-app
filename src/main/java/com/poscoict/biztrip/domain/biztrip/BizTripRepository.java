package com.poscoict.biztrip.domain.biztrip;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BizTripRepository extends JpaRepository<BizTrip, Long> {


	List<BizTrip> findByEmployeeId(Long employeeId);
}