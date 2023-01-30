package org.recru.currenda.court.mapper.casee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.recru.currenda.court.entity.casee.CaseEntity;
import org.recru.currenda.court.entity.casee.CaseNumber;
import org.recru.currenda.court.entity.casee.CaseState;
import org.recru.currenda.court.entity.casee.CaseType;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
class CaseMapperTest {
	@Mock
	private CaseNumberMapper caseNumberMapper;
	@InjectMocks
	private CaseMapper caseMapper = Mappers.getMapper(CaseMapper.class);

	@Test
	void toResponse() {
		// given
		CaseNumber caseNumber = new CaseNumber(123, 2021);
		CaseType caseType = CaseType.C;
		CaseState caseState = CaseState.OPEN;
		LocalDate dateOfEntry = LocalDate.of(2021, 1, 1);
		CaseEntity caseEntity = new CaseEntity(caseNumber, caseType, caseState, dateOfEntry);
		// when
		CaseResponse caseResponse = caseMapper.toResponse(caseEntity);
		// then
		assertEquals(caseNumberMapper.toResponse(caseNumber), caseResponse.getCaseNumber());
		assertEquals(caseType.name(), caseResponse.getCaseType());
		assertEquals(caseState.name(), caseResponse.getCaseState());
		assertEquals(dateOfEntry, caseResponse.getDateOfEntry());
	}
}