package org.example.hhjava245springdata.controller;

import lombok.RequiredArgsConstructor;
import org.example.hhjava245springdata.model.User;
import org.example.hhjava245springdata.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepo userRepo;

    //Dependency Injection
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id){
        return userRepo.findById(id).orElseThrow();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping
    public User getUserByNameAndAge(@RequestParam String name, @RequestParam int age){
        return userRepo.findUserByAgeAndName(age, name).orElseThrow();
    }

}
