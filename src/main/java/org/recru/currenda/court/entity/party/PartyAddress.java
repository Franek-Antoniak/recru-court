package org.recru.currenda.court.entity.party;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode
@Embeddable
public class PartyAddress {
	private String city;
	@Enumerated(EnumType.STRING) private PostalCode postalCode;
	@Embedded private Street street;
}
