package org.recru.currenda.court.repository.party;

import org.recru.currenda.court.entity.casee.CaseState;
import org.recru.currenda.court.entity.party.PartyEntity;

import java.util.List;

public interface PartyEntityRepository {
	List<PartyEntity> findAllByActiveAndCaseEntityCaseState(boolean active, CaseState caseState);

}
