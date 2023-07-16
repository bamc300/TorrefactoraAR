package co.com.torrefactora.TorrefactoraAR.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "estado")
@Data
@NoArgsConstructor
public class EstadoEntidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO")
    private int id;

    @Column(name = "NOMBRE_ESTADO", nullable = false, length = 15)
    private String nombre;

    @Column(name = "DESCRIPCION_ESTADO", length = 100)
    private String descripcion;

    @OneToMany(mappedBy = "estado")
    private List<SubtareaEntidad> subtareas;
}
