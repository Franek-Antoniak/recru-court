package org.recru.currenda.court.dto.party;

import lombok.Data;

@Data
public class PartyAddressResponse {
	private StreetResponse street;
	private String city;
	private PostalCodeResponse postalCode;
}
