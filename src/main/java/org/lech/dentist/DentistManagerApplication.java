package org.lech.dentist;

import org.lech.dentist.infrastructure.UserDomainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(UserDomainConfig.class)
public class DentistManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DentistManagerApplication.class, args);
    }
}