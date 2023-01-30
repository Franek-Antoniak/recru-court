package org.recru.currenda.court.repository.party;

import org.recru.currenda.court.dto.casee.CaseStateRequest;
import org.recru.currenda.court.entity.casee.CaseState;
import org.recru.currenda.court.entity.party.PartyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface JpaPartyEntityRepository extends PartyEntityRepository, JpaRepository<PartyEntity, Long> {
	List<PartyEntity> findAllByActiveAndCaseEntityCaseState(boolean active, CaseState caseState);
}