package de.beuth.knabe.spring_ddd_bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@SpringBootApplication // that is @Configuration @EnableAutoConfiguration @ComponentScan
@EnableSpringConfigured // for spring-aspects
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
