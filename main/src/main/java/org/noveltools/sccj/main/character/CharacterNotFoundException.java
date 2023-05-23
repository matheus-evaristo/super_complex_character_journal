package org.noveltools.sccj.main.character;

public class CharacterNotFoundException extends RuntimeException {
    CharacterNotFoundException(Long id) {
        super("Character not found. ID: " + id);
    }
}
