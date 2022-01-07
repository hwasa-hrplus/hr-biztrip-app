package com.poscoict.biztrip.domain.bizpurpose;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BizPurposeRepository extends JpaRepository<BizPurpose, String> {
	BizPurpose findByName(String name);
}