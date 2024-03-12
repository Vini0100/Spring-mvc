package com.projeto.boot.demomvc.web.controller;

import com.projeto.boot.demomvc.domain.Departamento;
import com.projeto.boot.demomvc.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DeparmentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("/cadastrar")
    public String cadastrar(Departamento departamento) {
     return "/departamento/cadastro";
    }
    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("departamentos", service.buscarTodos());
        return "/departamento/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Departamento departamento){
        service.salvar(departamento);
        return "redirect:/departamentos/cadastrar";
    }
}

