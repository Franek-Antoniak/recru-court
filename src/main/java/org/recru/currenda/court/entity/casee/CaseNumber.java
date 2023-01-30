package org.recru.currenda.court.entity.casee;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CaseNumber {
	@Column(name = "case_number_number")
	private Integer number;
	@Column(name = "case_number_year")
	private Integer year;
}