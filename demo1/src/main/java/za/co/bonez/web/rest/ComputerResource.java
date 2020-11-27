package za.co.bonez.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.bonez.service.ComputerService;
import za.co.bonez.service.dto.ComputerDTO;


@RestController
@RequestMapping("/api")
public class ComputerResource {

	@Autowired
	private ComputerService computerService;
	
	@GetMapping("/computers")
	public ResponseEntity<List<ComputerDTO>> getAllComputers(){
		Page<ComputerDTO> page = null;
	
	
	return ResponseEntity.ok().build();
	//return ResponseEntity.ok().body(page.getContent());
	}
}
