package org.recru.currenda.court.mapper.casee;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.recru.currenda.court.entity.casee.CaseEntity;
import org.recru.currenda.court.entity.casee.CaseState;
import org.recru.currenda.court.entity.casee.CaseType;

@Mapper(
		componentModel = "spring",
		uses = CaseNumberMapper.class
)
public interface CaseMapper {
	@Named("caseTypeToString")
	default String mapCaseType(CaseType caseType) {
		return caseType.toString();
	}

	@Named("caseStateToString")
	default String mapCaseState(CaseState caseState) {
		return caseState.toString();
	}

	@Mappings(
			{
					@Mapping(
							target = "caseNumber",
							source = "caseEntity.caseNumber"
					),
					@Mapping(
							target = "caseType",
							source = "caseEntity.caseType",
							qualifiedByName = "caseTypeToString"
					),
					@Mapping(
							target = "caseState",
							source = "caseEntity.caseState",
							qualifiedByName = "caseStateToString"
					),
					@Mapping(
							target = "dateOfEntry",
							source = "caseEntity.dateOfEntry"
					)
			}
	)
	CaseResponse toResponse(CaseEntity caseEntity);
}
