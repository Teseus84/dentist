package org.lech.dentist.infrastructure;

import org.lech.dentist.domain.user.core.UserFacade;
import org.lech.dentist.domain.user.core.ports.incoming.AddNewUser;
import org.lech.dentist.domain.user.core.ports.outgoing.UserDatabase;
import org.lech.dentist.domain.user.infrastructure.UserDataBaseAdapter;
import org.lech.dentist.domain.user.infrastructure.UserRepository;
import org.lech.dentist.domain.user.infrastructure.UserRepositoryInMemory;
import org.springframework.context.annotation.Bean;


public class UserDomainConfig {

    @Bean
    public UserDatabase userDatabase(UserRepository userRepository) {

        return new UserDataBaseAdapter(userRepository);
    }

    @Bean
    public AddNewUser addNewUser(UserDatabase userDatabase) {

        return new UserFacade(userDatabase);
    }

    @Bean
    public UserRepository userRepository() {

        return new UserRepositoryInMemory();
    }
}
