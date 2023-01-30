package org.recru.currenda.court.mapper.casee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.casee.CaseNumberResponse;
import org.recru.currenda.court.entity.casee.CaseNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CaseNumberMapperTest {
	private CaseNumberMapper caseNumberMapper = Mappers.getMapper(CaseNumberMapper.class);

	@Test
	void toResponse() {
		// given
		CaseNumber caseNumber = new CaseNumber(123, 2021);
		// when
		CaseNumberResponse caseNumberResponse = caseNumberMapper.toResponse(caseNumber);
		// then
		assertEquals(caseNumber.getNumber(), caseNumberResponse.getNumber());
		assertEquals(caseNumber.getYear(), caseNumberResponse.getYear());
	}
}