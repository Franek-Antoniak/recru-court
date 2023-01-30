package org.recru.currenda.court.repository.party;

import org.recru.currenda.court.entity.party.PartyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface JpaPartyEntityRepository extends PartyEntityRepository, JpaRepository<PartyEntity, Long> {
}