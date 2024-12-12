package com.api.photostudio.controller;

import com.api.photostudio.domain.cliente.Cliente;
import com.api.photostudio.domain.cliente.ClienteService;
import com.api.photostudio.domain.resumen.Resumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{fecha}")
    public List<Cliente> getClientesbyFecha(@PathVariable String fecha) {
        return clienteService.getClientesbyFecha(fecha);
    }

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable int id) {
        clienteService.deleteCliente(id);
    }
}
