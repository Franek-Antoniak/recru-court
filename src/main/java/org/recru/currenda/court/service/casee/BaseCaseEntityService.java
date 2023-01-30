package org.recru.currenda.court.service.casee;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.repository.casee.CaseEntityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class BaseCaseEntityService implements CaseEntityService {
	private final CaseEntityRepository caseEntityRepository;
}
