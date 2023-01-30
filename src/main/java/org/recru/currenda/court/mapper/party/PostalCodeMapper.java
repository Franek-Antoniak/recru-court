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
							target = "firstPart",
							source = "postalCode.firstPart"
					),
					@Mapping(
							target = "secondPart",
							source = "postalCode.secondPart"
					)
			}
	)
	PostalCodeResponse toResponse(PostalCode postalCode);
}