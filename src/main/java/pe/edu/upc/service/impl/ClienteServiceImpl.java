package pe.edu.upc.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.model.Cliente;
import pe.edu.upc.repository.ClienteRepository;
import pe.edu.upc.service.ClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl  implements ClienteService{


    ClienteRepository usuarioRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository usuarioRepository){this.usuarioRepository=usuarioRepository;}

    @Override
    public Cliente insert(Cliente usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Cliente update(Cliente usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Boolean delete(int id) {
        usuarioRepository.deleteById(id);
        return true;
    }

    @Override
    public Cliente getById(int id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> listAll() {
        return usuarioRepository.findAll();
    }
}
