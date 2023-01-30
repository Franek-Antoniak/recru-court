package org.recru.currenda.court.facade.casee;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Before;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Validated
public class CaseFacade {
	public Map<String, CaseResponse> getGroupedCasesByCaseType(@NotNull LocalDate from, @NotNull LocalDate to) {
		return null;
	}
}
