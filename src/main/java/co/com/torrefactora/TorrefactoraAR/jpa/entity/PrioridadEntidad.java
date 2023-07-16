package co.com.torrefactora.TorrefactoraAR.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "prioridad")
@Data
@NoArgsConstructor
public class PrioridadEntidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRIORIDAD")
    private int id;

    @Column(name = "NOMBRE_PRIORIDAD", nullable = false, length = 20)
    private String nombre;

    @Column(name = "DESCRIPCION_PRIORIDAD", length = 100)
    private String descripcion;

    @OneToMany(mappedBy = "prioridad")
    private List<TareaEntidad> tareas;
}
