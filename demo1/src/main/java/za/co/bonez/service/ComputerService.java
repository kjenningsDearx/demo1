package za.co.bonez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.bonez.respository.ComputerRespository;

@Service
public class ComputerService {

	@Autowired
	private ComputerRespository computerRespository;
}
