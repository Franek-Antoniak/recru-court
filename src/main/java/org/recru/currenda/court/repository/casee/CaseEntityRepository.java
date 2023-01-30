package org.recru.currenda.court.repository.casee;

import org.recru.currenda.court.entity.casee.CaseEntity;

import java.time.LocalDate;
import java.util.List;

public interface CaseEntityRepository {
	List<CaseEntity> findAllByDateOfEntryBetween(LocalDate from, LocalDate to);
}
