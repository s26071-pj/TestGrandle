package pl.pjatk.testgrandle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@With
@AllArgsConstructor
public class User {

    private int id;
    private String name;
    private String surname;
    private double saldo;

}
