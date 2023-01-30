package org.recru.currenda.court.entity.party;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Street {
	private String streetName;
	private String streetNumber;
}
