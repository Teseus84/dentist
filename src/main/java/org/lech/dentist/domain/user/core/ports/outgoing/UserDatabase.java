package org.lech.dentist.domain.user.core.ports.outgoing;

import org.lech.dentist.domain.user.core.model.UserIdentifier;

public interface UserDatabase {
    //    UserIdentifier save(User user);
    UserIdentifier save(Object user);
}
