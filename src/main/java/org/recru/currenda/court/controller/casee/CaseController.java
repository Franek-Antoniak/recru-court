package org.recru.currenda.court.controller.casee;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class CaseController {

	@GetMapping("/case-types/cases")
	public String casesGrouped(LocalDate from, LocalDate to) {
		return null;
	}
}
