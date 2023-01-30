package org.recru.currenda.court.entity.casee;


import jakarta.persistence.*;
import lombok.*;
import org.recru.currenda.court.entity.base.BaseEntity;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CaseEntity extends BaseEntity {
	@Embedded private CaseNumber caseNumber;
	@Enumerated(EnumType.STRING) private CaseType caseType;
	@Enumerated(EnumType.STRING) private CaseState caseState;
	private LocalDate dateOfEntry;
}
