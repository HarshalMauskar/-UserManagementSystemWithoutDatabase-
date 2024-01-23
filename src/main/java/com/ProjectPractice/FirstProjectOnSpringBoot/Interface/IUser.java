package com.ProjectPractice.FirstProjectOnSpringBoot.Interface;

import com.ProjectPractice.FirstProjectOnSpringBoot.model.User;

import java.util.List;

public interface IUser {
    User save(User user);

    List<User> displayAll();

    User update(User user,int Index);

    String delete(int Index);
}
