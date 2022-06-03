package pe.edu.ucs.jpa2022.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.ucs.jpa2022.entity.Empleado;

/**
 *
 * @author admin
 */
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
    
}
