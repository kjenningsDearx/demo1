package za.co.bonez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.bonez.respository.MotherboardRespository;

@Service
public class MotherboardService {

	@Autowired
	private MotherboardRespository motherboardRespository;
}
