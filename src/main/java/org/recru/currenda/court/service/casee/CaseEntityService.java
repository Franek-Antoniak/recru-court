package org.recru.currenda.court.service.casee;

import org.recru.currenda.court.dto.casee.CaseResponse;

import java.time.LocalDate;
import java.util.Map;

public interface CaseEntityService {
	Map<String, CaseResponse> getGroupedCasesByCaseType(LocalDate from, LocalDate to);
}
