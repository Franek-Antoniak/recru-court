package org.recru.currenda.court.entity.casee;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
class CaseNumber {
	private Integer number;
	private Integer year;
}