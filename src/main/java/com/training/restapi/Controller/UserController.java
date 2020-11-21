package com.training.restapi.Controller;

import com.training.restapi.Dao.UserDao;
import com.training.restapi.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user")
    public List<UserModel> getAllUsers(){
        return userDao.retrieveAllUsers();
    }

    @GetMapping("/user/{id}")
    public UserModel getUser(@PathVariable int id){
        return userDao.retrieveUserByUserId(id);
    }

    @PostMapping("/user")
    public void createUser(@RequestBody UserModel input_user){
        userDao.createUser(input_user);
    }


}
