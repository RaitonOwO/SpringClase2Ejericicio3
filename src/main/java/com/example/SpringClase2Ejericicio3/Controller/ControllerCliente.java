package com.example.SpringClase2Ejericicio3.Controller;


import com.example.SpringClase2Ejericicio3.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerCliente {

    @GetMapping("/api/clientes")
    public List<Cliente> obtenerClientes() {
        return Arrays.asList(
                new Cliente("Juan", 30),
                new Cliente("María", 25),
                new Cliente("Carlos", 40)
        );
    }
}
