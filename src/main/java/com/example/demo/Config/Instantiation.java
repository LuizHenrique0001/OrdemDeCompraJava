package com.example.demo.Config;

import com.example.demo.Entitys.Product;
import com.example.demo.Entitys.User;
import com.example.demo.Enum.Category;
import com.example.demo.Repositories.ProductRepository;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import static com.example.demo.Enum.Category.*;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {


        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com","+55 11 98888-1234", "senhaForte123", true);
        User joao = new User(null, "João Pereira", "joao.pereira@gmail.com", "+55 21 97777-4567", "senhaForte123", true);
        User ana = new User(null, "Ana Souza", "ana.souza@gmail.com", "+55 31 96666-9876", "senhaForte123", true);
        User lucas = new User(null, "Lucas Mendes", "lucas.mendes@gmail.com", "+55 61 95555-4321", "senhaForte123", true);
        User fernanda = new User(null, "Fernanda Lima", "fernanda.lima@gmail.com", "+55 41 94444-8765", "senhaForte123", false);
        User carlos = new User(null, "Carlos Silva", "carlos.silva@gmail.com", "+55 71 93333-6789", "senhaForte123", false);


        Product p1 = new Product(null, "Cadeira Ergonômica", "Cadeira com apoio lombar ajustável e rodinhas silenciosas.", 849.90, "https://exemplo.com/imgs/cadeira-ergonomica.jpg", ESCRITORIO);
        Product p2 = new Product(null, "Desinfetante Floral 5L", "Ideal para limpeza profunda com fragrância agradável e duradoura.", 24.50, "https://exemplo.com/imgs/desinfetante-floral.jpg", LIMPEZA);
        Product p3 = new Product(null, "Parafusadeira Elétrica 12V", "Ferramenta versátil para montagem de móveis e uso doméstico.", 199.99, "https://exemplo.com/imgs/parafusadeira-12v.jpg", FERRAMENTA);
         Product p4 = new Product(null, "HD Externo 1TB USB 3.0", "Armazenamento rápido e portátil com conexão USB 3.0.", 379.00, "https://exemplo.com/imgs/hd-externo-1tb.jpg", HARDWARE);
         Product p5 = new Product(null, "HD Externo 1TB USB 3.0", "Armazenamento rápido e portátil com conexão USB 3.0.", 379.00, "https://exemplo.com/imgs/hd-externo-1tb.jpg", HARDWARE);

        userRepository.saveAll(Arrays.asList(maria, joao, ana, lucas, fernanda, carlos));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

    }
}
