package pl.pjatk.testgrandle.service;


import org.springframework.stereotype.Service;
import pl.pjatk.testgrandle.exception.ValidationException;
import pl.pjatk.testgrandle.model.User;
import pl.pjatk.testgrandle.repository.UserStorage;

import java.util.Optional;

@Service
public class UserService {
    private UserStorage userStorage;

    public UserService(UserStorage userStorage){
        this.userStorage = userStorage;
    }

    public void addUser(User user){
        if (isInvalid(user.getName())) {
            throw new ValidationException("User name is required!");
        }

        if (isInvalid(user.getSurname())){
            throw new ValidationException("User surname is required!");
        }

        if (isInvalidSaldo(user.getSaldo())){
            throw new ValidationException("User starting saldo is required!");
        }
    }

    public Optional<User> findById(int id){
        Optional<User> optionalUser = userStorage.findUserById(id);
        return optionalUser;
    }

    private boolean isInvalid(String attribute) {
        return attribute == null || attribute.isBlank();
    }

    private boolean isInvalidSaldo(double attribute) {
        return false;
    }
}
