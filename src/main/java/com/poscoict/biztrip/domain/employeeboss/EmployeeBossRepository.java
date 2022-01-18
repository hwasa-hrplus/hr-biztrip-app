package com.poscoict.biztrip.domain.employeeboss;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeBossRepository extends JpaRepository<EmployeeBoss, Long> {}