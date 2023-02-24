package ro.mycode.computerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.mycode.computerapi.model.Computer;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ComputerRepo  extends JpaRepository<Computer,Long> {

    @Query("select distinct c.marca from Computer  c")
    List<String>getAllMarci();

    @Query("select c from Computer  c where c.marca=?1")

    List<Computer> getAllComputerByMarca(String marca);
    @Transactional
    @Modifying
    @Query("select distinct  c from Computer  c order by c.pret")
    List<Computer>sortByPrice();
    Computer findByMarca(String marca);
}

/*@Repository
public interface MasinaRepo extends JpaRepository<Masina,Long> {


    @Query("select  distinct p.marca from Masina  p")
    List<String> getAllMarci();

    @Query("select m  from  Masina m where  m.marca = ?1")//?1 este primul parametru de la List<masina>,daca ar avea 2 parametri am putea scrie si doi

    List<Masina> getAllMasinaByMarca(String marca);
}*/
