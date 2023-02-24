package ro.mycode.computerapi.controller;

import org.springframework.web.bind.annotation.*;
import ro.mycode.computerapi.dtos.ComputerDTO;
import ro.mycode.computerapi.model.Computer;
import ro.mycode.computerapi.repository.ComputerRepo;

import java.util.List;

@RestController
@CrossOrigin
public class ComputerController {
    private ComputerRepo computerRepo;

    public ComputerController(ComputerRepo computerRepo) {
        this.computerRepo = computerRepo;
    }

    @GetMapping("api/v1/computers")
    public List<Computer>getAllComputer(){

        return computerRepo.findAll();

    }

    @GetMapping("api/v1/computers/marci")

    public List<String>getAllMarci(){
        return computerRepo.getAllMarci();
    }

    @GetMapping("api/v1/computers/{marca}")

    public List<Computer>getAllComputerByMarca(@PathVariable String marca){
        return computerRepo.getAllComputerByMarca(marca);
    }

    @PostMapping("api/v1/add")
    public Computer addComputer(@RequestBody Computer computer){
        this.computerRepo.save(computer);

        return computer;
    }

    @DeleteMapping("api/v1/delete/{id}")

    public long deleteComputerById(@PathVariable long id){
        this.computerRepo.deleteById(id);
        return  id;
    }

    @PutMapping("api/v1/update")

    public Computer updateComputer(@RequestBody ComputerDTO computer){
        Computer c=computerRepo.findByMarca(computer.getModel());
        if(computer.getPret()!=0){
            c.setPret(computer.getPret());
        }else System.out.println("Nu are valoare");
        if(computer.getModel().equals("")==false){
            c.setMarca(computer.getMarca());
        }else System.out.println("Nu are valoare");
        if(computer.getDescription().equals("")==false){
            c.setDescription(computer.getDescription());
        }else System.out.println("Nu are valoare");

        computerRepo.save(c);
        return c;
    }

    @GetMapping("api/v1/sortByPrice")
    public List<Computer> sortByPrice(){
        return computerRepo.sortByPrice();
    }

}

