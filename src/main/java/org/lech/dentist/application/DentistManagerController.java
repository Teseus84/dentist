package org.lech.dentist.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DentistManagerController {

    @GetMapping("")
    public String getAppRoot() {
        return "Dentist Manager REST API";
    }
}