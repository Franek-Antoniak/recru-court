package org.recru.currenda.court.service;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.repository.CaseEntityRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CaseEntityServiceImpl implements CaseEntityService {
	private final CaseEntityRepository caseEntityRepository;
}
