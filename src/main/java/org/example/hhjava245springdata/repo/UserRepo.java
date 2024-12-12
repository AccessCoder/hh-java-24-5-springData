package org.example.hhjava245springdata.repo;

import org.example.hhjava245springdata.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    public Optional<User> findUserByAgeAndName(int age, String name);
}
