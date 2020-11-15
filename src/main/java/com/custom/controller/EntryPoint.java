package com.custom.controller;

import com.custom.annotation.FeatureFlag;
import com.custom.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryPoint {

    @GetMapping(value = "/getUsernameAndSurname")
    private User getUsernameAndSurname() {
        return User.builder().surname("Pakos").username("Fotis").build();
    }

    /**
     * Feature Flag CustomAnnotation
     */
    @FeatureFlag(enabled = false)
    @GetMapping(value = "/retrieveIfPossibleUsernameAndSurname")
    private User testFeatureFlag() {
        return User.builder().surname("Pakos").username("Fotis").build();
    }

}
