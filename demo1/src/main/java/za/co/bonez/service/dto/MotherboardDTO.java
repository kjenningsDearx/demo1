package za.co.bonez.service.dto;

import java.util.ArrayList;
import java.util.List;

import za.co.bonez.domain.RAM;

public class MotherboardDTO {

private Long id;
	
	private String name;
	
	private List<RAM> RAM = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RAM> getRAM() {
		return RAM;
	}

	public void setRAM(List<RAM> rAM) {
		RAM = rAM;
	}
	
	
}
