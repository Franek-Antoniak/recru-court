package org.recru.currenda.court.mapper.party;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.recru.currenda.court.dto.party.PartyResponse;
import org.recru.currenda.court.entity.party.PartyEntity;
import org.recru.currenda.court.entity.party.PartyType;


@Mapper(
		componentModel = "spring",
		uses = {
				PartyAddressMapper.class,
				PartyNameMapper.class
		}
)
public interface PartyMapper {
	@Mappings(
			{
					@Mapping(
							target = "partyType",
							source = "partyEntity.partyType",
							qualifiedByName = "partyTypeToString"
					),
					@Mapping(
							target = "name",
							source = "partyEntity.name"
					),
					@Mapping(
							target = "addresses",
							source = "partyEntity.addresses"
					),
					@Mapping(
							target = "active",
							source = "partyEntity.active"
					)
			}
	)
	PartyResponse toResponse(PartyEntity partyEntity);

	@Named("partyTypeToString")
	default String mapPartyType(PartyType partyType) {
		return partyType.toString();
	}
}