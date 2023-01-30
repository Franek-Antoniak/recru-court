package org.recru.currenda.court.repository.party;

import org.recru.currenda.court.entity.casee.CaseState;
import org.recru.currenda.court.entity.party.PartyEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Profile("jpa")
interface JpaPartyEntityRepository extends PartyEntityRepository, JpaRepository<PartyEntity, Long> {
	List<PartyEntity> findAllByActiveAndCaseEntityCaseState(boolean active, CaseState caseState);
}