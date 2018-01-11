package pe.heberqc.demobootgradle.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import pe.heberqc.demobootgradle.model.Player;

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player,Long>{
}
