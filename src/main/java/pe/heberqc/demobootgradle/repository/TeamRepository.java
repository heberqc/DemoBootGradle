package pe.heberqc.demobootgradle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import pe.heberqc.demobootgradle.model.Team;

@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long>{
}
