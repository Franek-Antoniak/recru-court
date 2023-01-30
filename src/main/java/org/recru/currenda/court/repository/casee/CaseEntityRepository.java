package org.recru.currenda.court.repository.casee;

import org.recru.currenda.court.entity.casee.CaseEntity;
import org.recru.currenda.court.entity.casee.CaseType;

import java.time.LocalDate;
import java.util.Map;

public interface CaseEntityRepository {
	Map<CaseType, CaseEntity> findByDateOfEntryBetweenGroupByCaseType(LocalDate from, LocalDate to);
}
