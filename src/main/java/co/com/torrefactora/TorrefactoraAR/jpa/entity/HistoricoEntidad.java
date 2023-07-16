package co.com.torrefactora.TorrefactoraAR.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "historico")
@Data
@NoArgsConstructor
public class HistoricoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HISTORICO")
    private int id;

    @ManyToOne
    @JoinColumn(name = "TAREA", nullable = false)
    private TareaEntidad tarea;

    @Column(name = "DESCRIPCION", length = 100)
    private String descripcion;

    @Column(name = "FECHA_ACTUALIZACION", nullable = false)
    private Timestamp fechaActualizacion;
}
