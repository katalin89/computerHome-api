package ro.mycode.computerapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "computers")
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements Comparable<Computer> {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private String marca;

    private int pret;

    private String description;

    public Computer(String marca, int pret, String description) {
        this.marca = marca;
        this.pret = pret;
        this.description = description;
    }

    @Override
    public String toString() {
        String text = "";
        text += marca + "," + pret + "," + description;
        return text;
    }


    public int compare(Object o) {
        Computer computer = (Computer) o;

        if (this.pret > computer.pret) {
            return 1;
        } else if (this.pret < computer.pret) {
            return 0;
        }
        return -1;
    }

    @Override
    public int compareTo(Computer o) {
        return 0;
    }
}
