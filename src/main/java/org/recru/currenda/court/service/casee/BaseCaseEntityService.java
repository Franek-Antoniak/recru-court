package org.recru.currenda.court.service.casee;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.recru.currenda.court.mapper.casee.CaseMapper;
import org.recru.currenda.court.repository.casee.CaseEntityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class BaseCaseEntityService implements CaseEntityService {
	private final CaseEntityRepository caseEntityRepository;
	private final CaseMapper caseMapper;

	@Override
	public Map<String, CaseResponse> getGroupedCasesByCaseType(LocalDate from, LocalDate to) {
		return caseEntityRepository.findByDateOfEntryBetweenGroupByCaseType(from, to)
				.entrySet()
				.stream()
				.collect(Collectors.toMap(entry -> entry.getKey()
						.name(), entry -> caseMapper.toResponse(entry.getValue())));
	}
}
