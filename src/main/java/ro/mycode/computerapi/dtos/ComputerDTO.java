package ro.mycode.computerapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComputerDTO {
    private String  marca="";
    private String model="";
    private  int pret=0;
    private String description="";
}


