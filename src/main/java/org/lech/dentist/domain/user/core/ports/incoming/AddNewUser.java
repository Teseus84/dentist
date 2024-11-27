package org.lech.dentist.domain.user.core.ports.incoming;

import org.lech.dentist.domain.user.core.model.AddUserCommand;
import org.lech.dentist.domain.user.core.model.UserIdentifier;

public interface AddNewUser {
    UserIdentifier handle(AddUserCommand addUserCommand);
}
