package pe.heberqc.demobootgradle.repository;

import org.springframework.data.repository.CrudRepository;
import pe.heberqc.demobootgradle.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
}
