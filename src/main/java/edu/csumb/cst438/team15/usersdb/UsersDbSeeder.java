package edu.csumb.cst438.team15.usersdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.team15.usersdb.entities.User;
import java.util.List;
import java.util.Arrays;

@Component
public class UsersDbSeeder implements CommandLineRunner {
    @Autowired
    IUsersRepository usersRepo;
    @Override
    public void run(String... args) throws Exception {
        User raeleen = new User("Raeleen","password",10000);
        User manjit = new User("Manjit","password",20000);
        User irais = new User("Irais","password",35000);

        //delete db data
        usersRepo.deleteAll();
        
        //add db seeds
        List<User> user = Arrays.asList(raeleen,manjit,irais);
        
        usersRepo.saveAll(user);
    }

}