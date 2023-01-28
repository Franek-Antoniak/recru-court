package org.recru.currenda.court.entity.party;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Street {
	private String streetName;
	private String streetNumber;
}
