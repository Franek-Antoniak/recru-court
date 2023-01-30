package org.recru.currenda.court.repository.casee;

import org.recru.currenda.court.entity.casee.CaseEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

@Profile("jpa")
interface JpaCaseEntityRepository extends CaseEntityRepository, JpaRepository<CaseEntity, Long> {
	List<CaseEntity> findAllByDateOfEntryBetween(@Param("from") LocalDate from, @Param("to") LocalDate to);
}