package org.recru.currenda.court.entity.party;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PostalCode {
	private String firstPart;
	private String secondPart;
}
