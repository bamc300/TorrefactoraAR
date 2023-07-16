package co.com.torrefactora.TorrefactoraAR.jpa.repository;

import co.com.torrefactora.TorrefactoraAR.jpa.entity.EstadoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoEntidad,Long> {
}
