package org.lech.dentist.domain.user.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private Long id;

    private String emailAddress;

    private String firstName;

    private String lastName;
}
