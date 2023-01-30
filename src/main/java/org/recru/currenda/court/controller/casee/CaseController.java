package org.recru.currenda.court.controller.casee;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.recru.currenda.court.facade.casee.CaseFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CaseController {
	private final CaseFacade caseFacade;

	@GetMapping("/case-types/cases")
	public Map<String, CaseResponse> casesGrouped(LocalDate from, LocalDate to) {
		return caseFacade.getGroupedCasesByCaseType(from, to);
	}
}
