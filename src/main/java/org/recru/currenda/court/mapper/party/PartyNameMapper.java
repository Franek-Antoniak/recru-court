package org.recru.currenda.court.mapper.party;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.recru.currenda.court.dto.party.PartyNameResponse;
import org.recru.currenda.court.entity.party.PartyName;


@Mapper(componentModel = "spring")
public interface PartyNameMapper {
	@Mappings(
			{
					@Mapping(
							target = "firstName",
							source = "partyName.firstName"
					),
					@Mapping(
							target = "surname",
							source = "partyName.surname"
					)
			}
	)
	PartyNameResponse toResponse(PartyName partyName);
}