package org.recru.currenda.court.facade.party;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.party.PartyResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PartyFacade {
	public List<PartyResponse> getPartiesWithCasesByActive(boolean active) {
		return null;
	}
}
