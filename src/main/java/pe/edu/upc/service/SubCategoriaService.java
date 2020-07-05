package pe.edu.upc.service;

import  pe.edu.upc.model.SubCategoria;

import java.util.List;

public interface SubCategoriaService extends CRUDService<SubCategoria> {
    public List<SubCategoria> findSubCategoriaByCategoria(int id);
}
