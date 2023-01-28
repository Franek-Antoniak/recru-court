package org.recru.currenda.court.entity.party;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PartyName {
	private String firstName;
	private String surname;
}
