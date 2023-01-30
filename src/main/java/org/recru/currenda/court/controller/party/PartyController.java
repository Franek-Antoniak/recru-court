package org.recru.currenda.court.controller.party;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PartyController {

	@GetMapping("/parties/cases")
	public String casesGrouped(@RequestParam boolean active) {
		return null;
	}
}
