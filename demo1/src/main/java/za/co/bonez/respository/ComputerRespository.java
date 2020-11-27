package za.co.bonez.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.bonez.domain.Computer;

public interface ComputerRespository extends JpaRepository<Computer, Long>{

}
