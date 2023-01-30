package org.recru.currenda.court.mapper.party;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.party.PartyNameResponse;
import org.recru.currenda.court.entity.party.PartyName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PartyNameMapperTest {
	private PartyNameMapper partyNameMapper = Mappers.getMapper(PartyNameMapper.class);

	@Test
	void toResponse() {
		// given
		PartyName partyName = new PartyName("John", "Smith");
		// when
		PartyNameResponse partyNameResponse = partyNameMapper.toResponse(partyName);
		// then
		assertEquals("John", partyNameResponse.getFirstName());
		assertEquals("Smith", partyNameResponse.getSurname());
	}
}