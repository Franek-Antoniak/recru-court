package org.recru.currenda.court.service.party;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.repository.party.PartyEntityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BasePartyEntityService implements PartyEntityService {
	private final PartyEntityRepository partyEntityRepository;
}
