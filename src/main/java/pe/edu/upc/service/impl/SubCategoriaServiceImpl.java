package pe.edu.upc.service.impl;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import pe.edu.upc.service.SubCategoriaService;

import pe.edu.upc.model.SubCategoria;
import pe.edu.upc.repository.SubCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategoriaServiceImpl implements SubCategoriaService {
    private SubCategoriaRepository categoriaRepository;

    @Autowired
    public SubCategoriaServiceImpl(SubCategoriaRepository categoriaRepository) {
        this.categoriaRepository=categoriaRepository;}

    @Override
    public SubCategoria insert(SubCategoria categoria){
        return categoriaRepository.save(categoria);
    }

    @Override
    public SubCategoria update(SubCategoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Boolean delete(int id) {
        categoriaRepository.deleteById(id);
        return true;
    }

    @Override
    public SubCategoria getById(int id) {
        Optional<SubCategoria> cat = categoriaRepository.findById(id);
        return cat.orElse(null);
    }

    @Override
    public List<SubCategoria> listAll() {
        return categoriaRepository.findAll();
    }
    @Override
    public List<SubCategoria> findSubCategoriaByCategoria(int id){
        return categoriaRepository.findSubCategoriaByCategoria(id);
    }
}