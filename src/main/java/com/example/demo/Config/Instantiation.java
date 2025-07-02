package com.example.demo.Config;

import com.example.demo.Entitys.User;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {


        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com","+55 11 98888-1234", "senhaForte123", true);
        User joao = new User(null, "João Pereira", "joao.pereira@gmail.com", "+55 21 97777-4567", "senhaForte123", true);
        User ana = new User(null, "Ana Souza", "ana.souza@gmail.com", "+55 31 96666-9876", "senhaForte123", true);
        User lucas = new User(null, "Lucas Mendes", "lucas.mendes@gmail.com", "+55 61 95555-4321", "senhaForte123", true);
        User fernanda = new User(null, "Fernanda Lima", "fernanda.lima@gmail.com", "+55 41 94444-8765", "senhaForte123", false);
        User carlos = new User(null, "Carlos Silva", "carlos.silva@gmail.com", "+55 71 93333-6789", "senhaForte123", false);

        userRepository.saveAll(Arrays.asList(maria, joao, ana, lucas, fernanda, carlos));

    }
}
