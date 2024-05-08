package com.example.api.sistemadegestao.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.sistemadegestao.modelo.ClienteModelo;
import com.example.api.sistemadegestao.modelo.RespostaModelo;
import com.example.api.sistemadegestao.repositorio.ClienteRepositorio;

@Service
public class ClienteServico {
    
    @Autowired
    private ClienteRepositorio cr;

    @Autowired
    private RespostaModelo rm;


    //Método para listar todos os clientes
    public Iterable<ClienteModelo> listar() {
        return cr.findAll();
    }

    //Método para cadastrar os clientes

}
