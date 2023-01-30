package org.recru.currenda.court.dto.party;

import lombok.Data;

import java.util.List;

@Data
public class PartyResponse {
	private String partyType;
	private PartyNameResponse name;
	private List<PartyAddressResponse> addresses;
	private boolean active;
}
