package org.recru.currenda.court.repository.casee;

import org.recru.currenda.court.entity.casee.CaseEntity;
import org.recru.currenda.court.entity.casee.CaseType;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Profile("jpa")
interface JpaCaseEntityRepository extends CaseEntityRepository, JpaRepository<CaseEntity, Long> {
	default Map<CaseType, CaseEntity> findByDateOfEntryBetweenGroupByCaseType(LocalDate from, LocalDate to) {
		List<CaseEntity> caseResponses = findAllByDateOfEntryBetween(from, to);
		return caseResponses.stream()
				.collect(Collectors.toMap(CaseEntity::getCaseType, Function.identity()));
	}

	List<CaseEntity> findAllByDateOfEntryBetween(@Param("from") LocalDate from, @Param("to") LocalDate to);
}