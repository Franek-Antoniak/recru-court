package org.recru.currenda.court.service.party;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.party.PartyAddressResponse;
import org.recru.currenda.court.entity.party.PartyAddress;
import org.recru.currenda.court.entity.party.PartyEntity;
import org.recru.currenda.court.mapper.party.PartyAddressMapper;
import org.recru.currenda.court.repository.party.PartyEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Service
@RequiredArgsConstructor
public class BasePartyEntityService implements PartyEntityService {
	private final PartyEntityRepository partyEntityRepository;
	private final PartyAddressMapper partyAddressMapper;

	@Override
	public List<PartyAddressResponse> getPartiesAddressesWithCasesByActive(boolean active) {
		List<PartyEntity> parties = partyEntityRepository.findAllByActive(active);
		Set<PartyAddress> partyAddresses = parties.stream()
				.map(PartyEntity::getAddress)
				.collect(toSet());
		return partyAddresses.stream()
				.map(partyAddressMapper::toResponse)
				.toList();
	}
}
