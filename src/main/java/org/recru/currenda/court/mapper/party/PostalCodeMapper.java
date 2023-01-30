package org.recru.currenda.court.mapper.party;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.recru.currenda.court.dto.party.PostalCodeResponse;
import org.recru.currenda.court.entity.party.PostalCode;

@Mapper(componentModel = "spring")
public interface PostalCodeMapper {
	@Mappings(
			{
					@Mapping(
							target = "first_part_postal_code",
							source = "postalCode.first_part_postal_code"
					),
					@Mapping(
							target = "second_part_postal_code",
							source = "postalCode.second_part_postal_code"
					)
			}
	)
	PostalCodeResponse toResponse(PostalCode postalCode);
}