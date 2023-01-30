package org.recru.currenda.court.entity.party;

import jakarta.persistence.*;
import lombok.*;
import org.recru.currenda.court.entity.base.BaseEntity;
import org.recru.currenda.court.entity.casee.CaseEntity;

import java.util.List;


@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PartyEntity extends BaseEntity {
	@ManyToOne(optional = false) private CaseEntity caseEntity;
	@Enumerated(EnumType.STRING) private PartyType partyType;
	@Embedded private PartyName name;
	private boolean active;
	@ElementCollection private List<PartyAddress> addresses;
}
