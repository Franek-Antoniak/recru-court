package org.recru.currenda.court.repository.casee;

import org.recru.currenda.court.entity.casee.CaseEntity;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile("jpa")
interface JpaCaseEntityRepository extends CaseEntityRepository, JpaRepository<CaseEntity, Long> {
}