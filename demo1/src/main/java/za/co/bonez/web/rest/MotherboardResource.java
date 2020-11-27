package za.co.bonez.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.bonez.service.MotherboardService;
import za.co.bonez.service.dto.MotherboardDTO;

@RestController
@RequestMapping("/api")
public class MotherboardResource {

	@Autowired
	private MotherboardService motherboardService;
	
	@GetMapping("/motherboards")
	public ResponseEntity<List<MotherboardDTO>> getAllMotherboards(){
		Page<MotherboardDTO> page = null;
	
	
	return ResponseEntity.ok().build();
	//return ResponseEntity.ok().body(page.getContent());
	}
}
