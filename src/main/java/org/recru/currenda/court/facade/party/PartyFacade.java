package org.recru.currenda.court.facade.party;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.casee.CaseStateRequest;
import org.recru.currenda.court.dto.party.PartyAddressResponse;
import org.recru.currenda.court.service.party.PartyEntityService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@RequiredArgsConstructor
@Validated
public class PartyFacade {
	private final PartyEntityService partyEntityService;

	public List<PartyAddressResponse> getPartiesAddressesWithCasesByActive(@NotNull CaseStateRequest caseState,
			boolean active) {
		return partyEntityService.getPartiesAddressesWithCasesByActive(caseState, active);
	}
}
