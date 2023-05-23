package org.noveltools.sccj.main.character;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    private final CharacterRepository repository;

    CharacterController(CharacterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String getHome() {
        return "Home";
    }

    @GetMapping("/characters")
    public List<CharacterEntity> getCharacterList() {
        return repository.findAll();
    }

    @PostMapping("/characters")
    public CharacterEntity createCharacter(@RequestBody CharacterEntity newCharacterEntity) {
        return repository.save(newCharacterEntity);
    }

    @GetMapping("/characters/{id}")
    public CharacterEntity getCharacter(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new CharacterNotFoundException(id));
    }
}
