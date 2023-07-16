package co.com.torrefactora.TorrefactoraAR.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tarea")
@Data
@NoArgsConstructor
public class TareaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TAREA")
    private int id;

    @Column(name = "NOMBRE_TAREA", nullable = false, length = 200)
    private String nombre;

    @Column(name = "DURACION", nullable = false)
    private int duracion;

    @Column(name = "fecha_inicio", nullable = false)
    private Timestamp fechaInicio;

    @ManyToOne
    @JoinColumn(name = "PRIORIDAD", nullable = false)
    private PrioridadEntidad prioridad;

    @Column(name = "fecha_actualizacion", nullable = false)
    private Timestamp fechaActualizacion;

    @Column(name = "ESTADO", nullable = false, length = 15)
    private String estado;

    @OneToMany(mappedBy = "tarea")
    private List<SubtareaEntidad> subtareas;

    @OneToMany(mappedBy = "tarea")
    private List<HistoricoEntidad> historicos;
}
