package org.recru.currenda.court.entity.party;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.recru.currenda.court.entity.base.BaseEntity;

@Entity
@Getter
@Setter
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PartyAddress extends BaseEntity {
	private String city;
	@Enumerated(EnumType.STRING)
	private PostalCode postalCode;
	@Embedded
	private Street street;
}
