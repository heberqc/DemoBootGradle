package pe.heberqc.demobootgradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.heberqc.demobootgradle.model.Player;
import pe.heberqc.demobootgradle.model.Team;
import pe.heberqc.demobootgradle.repository.TeamRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoBootGradleApplication {

	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Set<Player> set = new HashSet<>();
		set.add(new Player("Big Easy", "Showman"));
		set.add(new Player("Buckets", "Guard"));
		set.add(new Player("Dizzy", "Guard"));

		list.add(new Team("Harlem", "Globetrotters", set));
		list.add(new Team("Washington","Generals",null));


		teamRepository.save(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoBootGradleApplication.class, args);
	}
}
