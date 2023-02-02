package pl.pjatk.testgrandle.repository;

import org.springframework.stereotype.Repository;
import pl.pjatk.testgrandle.model.Transfer;


import java.util.ArrayList;
import java.util.List;



@Repository
public class TransferStorage {

   private List<Transfer> transferList = new ArrayList<>();

   public Transfer save(Transfer transfer){
       transferList.add(transfer);
    return transfer;
   }

   public List<Transfer> findAll(){
       return transferList;
   }

   public void removeAll(){
       transferList = new ArrayList<>();
   }
}
