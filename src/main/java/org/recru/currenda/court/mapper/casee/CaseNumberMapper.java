package org.recru.currenda.court.mapper.casee;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.recru.currenda.court.dto.casee.CaseNumberResponse;
import org.recru.currenda.court.entity.casee.CaseNumber;


@Mapper(
		componentModel = "spring"
)
public interface CaseNumberMapper {

	@Mappings(
			{
					@Mapping(
							source = "caseNumber.number",
							target = "number"
					),
					@Mapping(
							source = "caseNumber.year",
							target = "year"
					)
			}
	)
	CaseNumberResponse toResponse(CaseNumber caseNumber);
}