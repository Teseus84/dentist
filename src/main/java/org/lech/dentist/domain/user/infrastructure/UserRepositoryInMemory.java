package org.lech.dentist.domain.user.infrastructure;

import org.lech.dentist.domain.user.core.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserRepositoryInMemory implements UserRepository {

    private final List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {

        user.setId(new Random().nextLong());
        users.add(user);
        return user;
    }
}
