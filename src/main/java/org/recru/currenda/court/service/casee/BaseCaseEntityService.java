package org.recru.currenda.court.service.casee;

import lombok.RequiredArgsConstructor;
import org.recru.currenda.court.dto.casee.CaseResponse;
import org.recru.currenda.court.entity.casee.CaseEntity;
import org.recru.currenda.court.mapper.casee.CaseMapper;
import org.recru.currenda.court.repository.casee.CaseEntityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class BaseCaseEntityService implements CaseEntityService {
	private final CaseEntityRepository caseEntityRepository;
	private final CaseMapper caseMapper;

	@Override
	public Map<String, List<CaseResponse>> getGroupedCasesByCaseType(LocalDate from, LocalDate to) {
		List<CaseEntity> list = caseEntityRepository.findAllByDateOfEntryBetween(from, to);
		return list.stream()
				.collect(Collectors.groupingBy(caseEntity -> caseEntity.getCaseType()
						.name()))
				.entrySet()
				.stream()
				.collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue()
						.stream()
						.map(caseMapper::toResponse)
						.toList()));
	}
}
