package pl.pjatk.testgrandle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@With
public class Transfer {
    private int idStatus;
    private int idUser;
    private double amount;

    private TransferStatus transferStatus;

}
