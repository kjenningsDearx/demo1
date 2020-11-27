package za.co.bonez.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.bonez.service.RAMService;
import za.co.bonez.service.dto.RAMDTO;

@RestController
@RequestMapping("/api")
public class RAMResource {

	@Autowired
	private RAMService rAMService;
	
	@GetMapping("/RAM")
	public ResponseEntity<List<RAMDTO>> getAllRAM(){
		Page<RAMDTO> page = null;
	
	
	return ResponseEntity.ok().build();
	//return ResponseEntity.ok().body(page.getContent());
	}
}
