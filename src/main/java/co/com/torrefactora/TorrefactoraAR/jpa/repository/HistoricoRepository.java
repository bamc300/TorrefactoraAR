package co.com.torrefactora.TorrefactoraAR.jpa.repository;

import co.com.torrefactora.TorrefactoraAR.jpa.entity.HistoricoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<HistoricoEntidad,Long> {
}
