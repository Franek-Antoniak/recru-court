package org.recru.currenda.court.entity.casee;


import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseNumber {
	private Integer number;
	private Integer year;
}