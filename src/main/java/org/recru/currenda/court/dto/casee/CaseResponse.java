package org.recru.currenda.court.dto.casee;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CaseResponse {
	private CaseNumberResponse caseNumber;
	private String caseType;
	private String caseState;
	private LocalDate dateOfEntry;
}
