package pe.heberqc.demobootgradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.heberqc.demobootgradle.model.Team;
import pe.heberqc.demobootgradle.repository.TeamRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoBootGradleApplication {

	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		teamRepository.save(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoBootGradleApplication.class, args);
	}
}
