package com.example.api.sistemadegestao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.sistemadegestao.modelo.ClienteModelo;
import com.example.api.sistemadegestao.servico.ClienteServico;

@RestController
public class ClienteControle {
    
    @Autowired
    private ClienteServico cs;

    //Método para listar todos os produtos
    @GetMapping("/listarclientes")
    public Iterable<ClienteModelo> listar() {
        return cs.listar();
    }

    @GetMapping("/")
    public String rota() {
        return "API funcionando";
    }

}
