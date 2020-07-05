package pe.edu.upc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.model.Vendedor;
public interface VendorRepository extends JpaRepository<Vendedor,Integer> {

}
