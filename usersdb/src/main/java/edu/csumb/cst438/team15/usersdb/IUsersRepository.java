package edu.csumb.cst438.team15.usersdb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.team15.usersdb.entities.User;

@Repository
public interface IUsersRepository extends MongoRepository<User,String>{
    @Query("{ 'username': ?0}")
    List<User> getUserInfo(@Param("name") String name);
}