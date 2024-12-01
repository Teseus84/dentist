package org.lech.dentist.domain.user.infrastructure;

import org.lech.dentist.domain.user.core.model.User;

public interface UserRepository {

    User save(User user);
}
