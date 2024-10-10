package com.cursoJava.curso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usuarioController {

    @ResquestMapping(value = "prueba")
    public List<String> prueba() {
        return List.of(" Mango", "Guayaba", "Tamarindo");
    }
}
