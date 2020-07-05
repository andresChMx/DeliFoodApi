package pe.edu.upc.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.model.Producto;
import pe.edu.upc.model.Producto;
import pe.edu.upc.repository.ProductoRepository;
import pe.edu.upc.service.ProductoService;
import pe.edu.upc.service.ProductoService;

import java.util.List;

@Service
public class ProductoServiceImpl  implements ProductoService {


    ProductoRepository usuarioRepository;

    @Autowired
    public ProductoServiceImpl(ProductoRepository usuarioRepository){this.usuarioRepository=usuarioRepository;}

    @Override
    public Producto insert(Producto usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Producto update(Producto usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Boolean delete(int id) {
        usuarioRepository.deleteById(id);
        return true;
    }

    @Override
    public Producto getById(int id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Producto> listAll() {
        return usuarioRepository.findAll();
    }
}
