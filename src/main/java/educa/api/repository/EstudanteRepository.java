package educa.api.repository;

import educa.api.model.Estudante;
import educa.api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

    public Optional<Estudante> findByEmail(String email);

}
