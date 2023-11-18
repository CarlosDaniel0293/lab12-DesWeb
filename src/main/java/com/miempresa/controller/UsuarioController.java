package com.miempresa.controller;

import com.miempresa.LAB.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UsuarioController {

    @GetMapping("/formulario")
    public String mostrarFormulario(Usuario usuario) {
        return "formulario";
    }

    @PostMapping("/formulario")
    public String procesarFormulario(@Valid Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "formulario";
        }

        return "redirect:/exito";
    }

    @GetMapping("/exito")
    public String mostrarExito() {
        return "exito";
    }
}
