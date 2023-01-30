package org.recru.currenda.court.dto.party;

import lombok.Data;

@Data
public class PostalCodeResponse {
	private String firstPart;
	private String secondPart;

	@Override
	public String toString() {
		return firstPart + "-" + secondPart;
	}
}
