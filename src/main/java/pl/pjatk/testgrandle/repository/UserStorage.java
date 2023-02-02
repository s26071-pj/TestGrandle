package pl.pjatk.testgrandle.repository;


import org.springframework.stereotype.Repository;
import pl.pjatk.testgrandle.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserStorage {

  private List<User> userList = new ArrayList<>();

  public void addUser(User user) throws Exception{
    if(userList.contains(user)){
      throw new Exception();
    }
    userList.add(user);
  }

  public Optional<User> findUserById(int id){
    return userList.stream().filter(it -> it.getId() == id).findFirst();
  }

  public void removeAll(){
    userList = new ArrayList<>();
  }

}
