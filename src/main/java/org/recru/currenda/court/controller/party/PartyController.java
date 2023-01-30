package org.recru.currenda.court.controller.party;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.casee.CaseStateRequest;
import org.recru.currenda.court.dto.party.PartyAddressResponse;
import org.recru.currenda.court.facade.party.PartyFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PartyController {
	private final PartyFacade partyFacade;

	@GetMapping("/parties/cases")
	public List<PartyAddressResponse> partiesWithCasesByActive(@RequestParam CaseStateRequest caseState,
			@RequestParam boolean active) {
		return partyFacade.getPartiesAddressesWithCasesByActive(caseState, active);
	}
}
