package ro.mycode.computerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.mycode.computerapi.model.Computer;

@Repository
public interface ComputerRepo  extends JpaRepository<Computer,Long> {
}
