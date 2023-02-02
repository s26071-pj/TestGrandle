package pl.pjatk.testgrandle.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.testgrandle.exception.DatabaseException;
import pl.pjatk.testgrandle.exception.ValidationException;
import pl.pjatk.testgrandle.model.User;
import pl.pjatk.testgrandle.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){

        try{
            userService.addUser(user);
        } catch (ValidationException validationException){
            return ResponseEntity.badRequest().build();
        } catch (DatabaseException databaseException){
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(user);
    }
}
