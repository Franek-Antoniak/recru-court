package org.recru.currenda.court.mapper.party;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.recru.currenda.court.dto.party.StreetResponse;
import org.recru.currenda.court.entity.party.Street;


@Mapper(componentModel = "spring")
public interface StreetMapper {
	@Mappings(
			{
					@Mapping(
							target = "streetName",
							source = "street.streetName"
					),
					@Mapping(
							target = "streetNumber",
							source = "street.streetNumber"
					)
			}
	)
	StreetResponse toResponse(Street street);
}