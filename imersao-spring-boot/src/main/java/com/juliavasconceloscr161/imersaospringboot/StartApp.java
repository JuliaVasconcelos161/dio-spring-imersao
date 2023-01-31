package com.juliavasconceloscr161.imersaospringboot;

import com.juliavasconceloscr161.imersaospringboot.model.User;
import com.juliavasconceloscr161.imersaospringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Júlia");
        user.setUsername("jvcr");
        user.setPassword("Ju123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
