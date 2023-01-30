package org.recru.currenda.court.facade.casee;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.recru.currenda.court.service.casee.CaseEntityService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Validated
public class CaseFacade {
	private final CaseEntityService caseEntityService;

	public Map<String, List<CaseResponse>> getGroupedCasesByCaseType(@NotNull LocalDate from, @NotNull LocalDate to) {
		return caseEntityService.getGroupedCasesByCaseType(from, to);
	}
}
