package edu.csumb.cst438.team15.usersdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.team15.usersdb.entities.User;

@RestController
public class UsersController {
    @Autowired
    IUsersRepository usersRepository;

    @GetMapping("/allUsers")
    public List<User> getAll() {
        List<User> result = usersRepository.findAll();
        return result;
    }
}