package com.ProjectPractice.FirstProjectOnSpringBoot.controller;

import com.ProjectPractice.FirstProjectOnSpringBoot.Interface.IUser;
import com.ProjectPractice.FirstProjectOnSpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUser iUser;

    @PostMapping("/insertUser")
    public User insertData(@RequestBody User user){
        User user1 = iUser.save(user);
        return user1;
    }
    @GetMapping("/display")
    public List<User> displayAll(){
        return iUser.displayAll();

    }

    @PutMapping("/update")
    public User update(@RequestBody User user , @RequestParam int Index){
        User user1 = iUser.update(user,Index);
        return user1;
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int Index){
        String user = iUser.delete(Index);
        return user;
    }

}
