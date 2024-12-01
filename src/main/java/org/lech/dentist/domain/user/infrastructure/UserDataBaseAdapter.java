package org.lech.dentist.domain.user.infrastructure;

import lombok.AllArgsConstructor;
import org.lech.dentist.domain.user.core.model.User;
import org.lech.dentist.domain.user.core.model.UserIdentifier;
import org.lech.dentist.domain.user.core.ports.outgoing.UserDatabase;

@AllArgsConstructor
public class UserDataBaseAdapter implements UserDatabase {

    private UserRepository userRepository;

    @Override
    public UserIdentifier save(User user) {
        User savedUser = userRepository.save(user);
        return new UserIdentifier(savedUser.getId());
    }
}
