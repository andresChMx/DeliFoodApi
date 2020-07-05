package pe.edu.upc.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
