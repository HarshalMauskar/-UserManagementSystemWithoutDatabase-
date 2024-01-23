package com.ProjectPractice.FirstProjectOnSpringBoot.service;

import com.ProjectPractice.FirstProjectOnSpringBoot.Interface.IUser;
import com.ProjectPractice.FirstProjectOnSpringBoot.model.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@Service
public class UserService implements IUser {
    private List<User> users = new LinkedList<>();
    @Override
    public User save(User user) {
        if (user.getFirstName().equals(null) || user.getLastName().equals(null)){return null;}

        users.add(user);
        return user;
    }

    @Override
    public List<User> displayAll() {
        return users;
    }

    public User update(User user,int Index){
        if (user.getFirstName().equals(null) || user.getLastName().equals(null)){return null;}
        users.add(Index,user);
        return user;
    }

//    @Override
//    public User delete() {
//        return null;
//    }

    public String delete(int Index){
        users.remove(Index);
        return "deleted";
    }

}
