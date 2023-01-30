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
	private String first_part_postal_code;
	private String second_part_postal_code;
}
