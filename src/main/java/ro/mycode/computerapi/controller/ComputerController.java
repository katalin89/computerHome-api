package ro.mycode.computerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.mycode.computerapi.model.Computer;
import ro.mycode.computerapi.repository.ComputerRepo;

import java.util.List;

@RestController
public class ComputerController {
    private ComputerRepo computerRepo;

    public ComputerController(ComputerRepo computerRepo) {
        this.computerRepo = computerRepo;
    }

    @GetMapping("/kati/computers")
    public List<Computer>getAllComputer(){
        return computerRepo.findAll();
    }
}
/*
@RestController
public class MasinaController {


    private MasinaRepo masinaRepo;

    public MasinaController(MasinaRepo masinaRepo) {
        this.masinaRepo = masinaRepo;
    }

    @GetMapping("/kati/masini")
    public List<Masina>getAllCars(){

        return masinaRepo.findAll();
    }
}
*/
