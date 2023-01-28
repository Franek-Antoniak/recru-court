package org.recru.currenda.court.dto.casee;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CaseRequest {
	private String caseType;
	private LocalDate startDateOfEntry;
	private LocalDate endDateOfEntry;
}

