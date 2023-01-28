package org.recru.currenda.court.entity.party;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class PostalCode {
	private int firstPart;
	private int secondPart;
}
