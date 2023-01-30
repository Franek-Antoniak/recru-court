package org.recru.currenda.court.mapper.party;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.recru.currenda.court.dto.party.PartyAddressResponse;
import org.recru.currenda.court.entity.party.PartyAddress;


@Mapper(
		componentModel = "spring",
		uses = {
				StreetMapper.class,
				PostalCodeMapper.class
		}
)
public interface PartyAddressMapper {
	@Mappings(
			{
					@Mapping(
							target = "street",
							source = "partyAddress.street"
					),
					@Mapping(
							target = "city",
							source = "partyAddress.city"
					),
					@Mapping(
							target = "postalCode",
							source = "partyAddress.postalCode"
					)
			}
	)
	PartyAddressResponse toResponse(PartyAddress partyAddress);
}