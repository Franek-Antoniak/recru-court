package org.recru.currenda.court.controller.party;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.party.PartyResponse;
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
	public List<PartyResponse> partiesWithCasesByActive(@RequestParam boolean active) {
		return partyFacade.getPartiesWithCasesByActive(active);
	}
}
