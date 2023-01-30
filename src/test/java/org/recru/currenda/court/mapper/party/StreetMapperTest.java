package org.recru.currenda.court.mapper.party;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.party.StreetResponse;
import org.recru.currenda.court.entity.party.Street;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class StreetMapperTest {
	private StreetMapper streetMapper = Mappers.getMapper(StreetMapper.class);

	@Test
	void toResponse() {
		// given
		Street street = new Street("streetName", "streetNumber");
		// when
		StreetResponse streetResponse = streetMapper.toResponse(street);
		// then
		assertEquals(street.getStreetName(), streetResponse.getStreetName());
		assertEquals(street.getStreetNumber(), streetResponse.getStreetNumber());
	}
}