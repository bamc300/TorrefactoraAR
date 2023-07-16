package co.com.torrefactora.TorrefactoraAR.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "subtarea")
@Data
@NoArgsConstructor
public class SubtareaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBTAREA")
    private int id;

    @Column(name = "NOMBRE_SUBTAREA", nullable = false, length = 200)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "ESTADO", nullable = false)
    private EstadoEntidad estado;

    @Column(name = "DURACION", nullable = false)
    private int duracion;

    @Column(name = "fecha_inicio", nullable = false)
    private Timestamp fechaInicio;

    @Column(name = "fecha_actualizacion", nullable = false)
    private Timestamp fechaActualizacion;

    @ManyToOne
    @JoinColumn(name = "TAREA", nullable = false)
    private TareaEntidad tarea;

}
