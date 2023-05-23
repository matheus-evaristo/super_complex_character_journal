package org.noveltools.sccj.main.character;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CharacterNotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(CharacterNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String characterNotFoundHandler(CharacterNotFoundException ex) {
        return ex.getMessage();
    }
}
