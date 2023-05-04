package org.noveltools.sccj.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @GetMapping("/")
    public String getHome() {
        return "Home";
    }

    @GetMapping("/list")
    public String getCharacterList() {
        return "Character list api.";
    }
}
