package com.custom.model;

import lombok.Getter;
import lombok.Setter;

/**
 *  With the below annotations {@Getter and @Setter}
 *  we let lombok generate the default getter/setter automatically.
 *  Please @see {@link https://projectlombok.org/features/GetterSetter}
 */
@Getter
@Setter
public class User {

    private String username;

    private String surname;
}
