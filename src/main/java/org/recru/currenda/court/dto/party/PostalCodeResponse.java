package org.recru.currenda.court.dto.party;

import lombok.Data;

@Data
public class PostalCodeResponse {
	private String first_part_postal_code;
	private String second_part_postal_code;

	@Override
	public String toString() {
		return first_part_postal_code + "-" + second_part_postal_code;
	}
}
