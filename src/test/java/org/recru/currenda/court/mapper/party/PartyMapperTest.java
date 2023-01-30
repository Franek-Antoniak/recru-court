package org.recru.currenda.court.mapper.party;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.party.PartyResponse;
import org.recru.currenda.court.entity.party.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PartyMapperTest {
	@Mock
	private PartyAddressMapper partyAddressMapper;
	@Mock
	private PartyNameMapper partyNameMapper;
	@InjectMocks
	private PartyMapper partyMapper = Mappers.getMapper(PartyMapper.class);

	@Test
	void toResponse() {
		// given
		PartyType partyType = PartyType.PLAINTIFF;
		PartyName name = new PartyName("John", "Doe");
		boolean active = true;
		Street street = new Street("streetName", "streetNumber");
		PostalCode postalCode = new PostalCode("22-100", "Lublin");
		PartyAddress partyAddress = new PartyAddress("Warsaw", postalCode, street);
		PartyEntity partyEntity = new PartyEntity(null, partyType, name, active, partyAddress);
		// when
		PartyResponse partyResponse = partyMapper.toResponse(partyEntity);
		// then
		assertEquals(partyResponse.getPartyType(), partyEntity.getPartyType()
				.name());
		assertEquals(partyResponse.getName(), partyNameMapper.toResponse(partyEntity.getName()));
		assertEquals(partyResponse.isActive(), partyEntity.isActive());
		assertEquals(partyResponse.getAddress(), partyAddressMapper.toResponse(partyEntity.getAddress()));
	}
}
