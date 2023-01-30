package org.recru.currenda.court.facade.party;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.party.PartyAddressResponse;
import org.recru.currenda.court.service.party.PartyEntityService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PartyFacade {
	private final PartyEntityService partyEntityService;

	public List<PartyAddressResponse> getPartiesAddressesWithCasesByActive(boolean active) {
		return partyEntityService.getPartiesAddressesWithCasesByActive(active);
	}
}
