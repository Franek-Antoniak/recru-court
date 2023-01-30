package org.recru.currenda.court.service.party;

import org.recru.currenda.court.dto.party.PartyAddressResponse;

import java.util.List;

public interface PartyEntityService {
	List<PartyAddressResponse> getPartiesAddressesWithCasesByActive(boolean active);
}
