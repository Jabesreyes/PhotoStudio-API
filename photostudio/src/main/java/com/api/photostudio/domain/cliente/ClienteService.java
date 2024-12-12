package com.api.photostudio.domain.cliente;

import com.api.photostudio.domain.resumen.Resumen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public List<Cliente> getClientesbyFecha(String fecha){
        LocalDate localDate = LocalDate.parse(fecha);
        return clienteRepository.findByFecha(localDate);
    }


    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(int id) {
        clienteRepository.deleteById(id);
    }
}
