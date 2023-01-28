package org.recru.currenda.court.entity.party;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.recru.currenda.court.entity.base.BaseEntity;
import org.recru.currenda.court.entity.casee.CaseEntity;


@Getter
@Setter
@ToString
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PartyEntity extends BaseEntity {
	@ManyToOne(optional = false)
	private CaseEntity caseEntity;
	@Enumerated(EnumType.STRING)
	private PartyType partyType;
	@Embedded
	private PartyName name;
	private boolean active;
	@ManyToOne(optional = false)
	private PartyAddress address;
}
