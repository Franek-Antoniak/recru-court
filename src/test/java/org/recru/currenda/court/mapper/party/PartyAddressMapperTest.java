package org.recru.currenda.court.mapper.party;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.party.PartyAddressResponse;
import org.recru.currenda.court.entity.party.PartyAddress;
import org.recru.currenda.court.entity.party.PostalCode;
import org.recru.currenda.court.entity.party.Street;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PartyAddressMapperTest {
	@Mock private StreetMapper streetMapper;
	@Mock private PostalCodeMapper postalCodeMapper;
	@InjectMocks private PartyAddressMapper partyAddressMapper = Mappers.getMapper(PartyAddressMapper.class);

	@Test
	void toResponse() {
		// given
		Street street = new Street("streetName", "streetNumber");
		PostalCode postalCode = new PostalCode("22-100", "Lublin");
		PartyAddress partyAddress = new PartyAddress("Warsaw", postalCode, street);
		// when
		PartyAddressResponse partyAddressResponse = partyAddressMapper.toResponse(partyAddress);
		// then
		assertEquals(partyAddressResponse.getCity(), partyAddress.getCity());
		assertEquals(partyAddressResponse.getPostalCode(), postalCodeMapper.toResponse(partyAddress.getPostalCode()));
		assertEquals(partyAddressResponse.getStreet(), streetMapper.toResponse(partyAddress.getStreet()));
	}
}