package org.recru.currenda.court.repository.party;

import org.recru.currenda.court.entity.party.PartyEntity;

import java.util.List;

public interface PartyEntityRepository {

	List<PartyEntity> findAllByActive(boolean active);
}
