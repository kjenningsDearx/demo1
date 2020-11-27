package za.co.bonez.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.bonez.respository.RAMRespository;

@Service
public class RAMService {
	
	@Autowired
	private RAMRespository rAMRepostitory;
}
