package org.recru.currenda.court.mapper.party;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recru.currenda.court.dto.party.PostalCodeResponse;
import org.recru.currenda.court.entity.party.PostalCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PostalCodeMapperTest {
	private PostalCodeMapper postalCodeMapper = Mappers.getMapper(PostalCodeMapper.class);

	@Test
	void toResponse() {
		// given
		PostalCode postalCode = new PostalCode("22-100", "Lublin");
		// when
		PostalCodeResponse response = postalCodeMapper.toResponse(postalCode);
		// then
		assertEquals(postalCode.getFirst_part_postal_code(), response.getFirst_part_postal_code());
		assertEquals(postalCode.getSecond_part_postal_code(), response.getSecond_part_postal_code());
	}
}