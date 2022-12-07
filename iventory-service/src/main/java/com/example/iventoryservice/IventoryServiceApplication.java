package com.example.iventoryservice;

import com.example.iventoryservice.entity.Product;
import com.example.iventoryservice.repositoriy.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IventoryServiceApplication.class, args);
    }
@Bean
    CommandLineRunner start(ProductRepository productRepository){

        return args -> {
            productRepository.save(new Product(null,"PC",5555,55));
            productRepository.save(new Product(null,"Monitor",5555,55));
            productRepository.save(new Product(null,"Tv",5555,55));
            productRepository.save(new Product(null,"smart phone",5555,55));
            productRepository.findAll().forEach(p -> {
                System.out.println(p.getId());
            });
        };
    }

}


