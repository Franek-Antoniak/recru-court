package org.recru.currenda.court.dto.party;

import lombok.Data;

@Data
public class PartyResponse {
	private String partyType;
	private PartyNameResponse name;
	private PartyAddressResponse address;
	private boolean active;
}
