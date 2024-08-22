package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
    User user = new User();
    user.setNome("lucas");
    user.setPassword("12345");
    userRepository.save(user);
    for(User u : userRepository.findAll()) {
        System.out.println(u);
    }
    }
}
