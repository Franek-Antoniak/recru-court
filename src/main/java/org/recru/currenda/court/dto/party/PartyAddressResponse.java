package org.recru.currenda.court.dto.party;

import lombok.Data;

@Data
public class PartyAddressResponse {
	private String street;
	private String city;
	private PostalCodeResponse postalCode;
}
