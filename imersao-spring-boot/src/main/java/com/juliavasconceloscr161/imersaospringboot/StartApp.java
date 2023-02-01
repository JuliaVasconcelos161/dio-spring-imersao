package com.juliavasconceloscr161.imersaospringboot;

import com.juliavasconceloscr161.imersaospringboot.entity.User;
import com.juliavasconceloscr161.imersaospringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        List<User> users = repository.findByNameContaining("Júlia");
        List<User> users = repository.filtrarPorNome("Júlia");

        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("João");
        user.setUsername("jvcr");
        user.setPassword("Ju123");

        repository.save(user);

    }
}
