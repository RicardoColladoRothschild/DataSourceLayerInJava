package com.dataSourceLayerSample.OnlyDataSourceLayer.service;

import com.dataSourceLayerSample.OnlyDataSourceLayer.entity.User;
import com.dataSourceLayerSample.OnlyDataSourceLayer.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepo){
        this.userRepository = userRepo;
    }

    public void saveUser(String name, String email){
        User user = new User(name, email);
        this.userRepository.save(user);
        System.out.println("El usuario ha sido guardado con exito.");

    }

    public void listUsers(){
        List<User> users = this.userRepository.findAll();
        users.forEach(user-> System.out.println("Usuario: " + user.getName()));
    }
}
