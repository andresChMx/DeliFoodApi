package pe.edu.upc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProducto;

    private String nombreProducto;
    private double precio;
    private double peso;
    private String descripcion;
    private String imagen;

    @ManyToOne
    @JoinColumn(name="codSubCategoria")
    private SubCategoria subcategoria;
}
