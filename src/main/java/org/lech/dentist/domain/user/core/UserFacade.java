package org.lech.dentist.domain.user.core;

import org.lech.dentist.domain.user.core.model.AddUserCommand;
import org.lech.dentist.domain.user.core.model.UserIdentifier;
import org.lech.dentist.domain.user.core.ports.incoming.AddNewUser;
import org.lech.dentist.domain.user.core.ports.outgoing.UserDatabase;

public class UserFacade implements AddNewUser {

    UserDatabase userDatabase;

    @Override
    public UserIdentifier handle(AddUserCommand addUserCommand) {
        return null;
    }
}
