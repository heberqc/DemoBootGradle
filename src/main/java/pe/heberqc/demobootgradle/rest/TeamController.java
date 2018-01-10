package pe.heberqc.demobootgradle.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.heberqc.demobootgradle.model.Team;
import pe.heberqc.demobootgradle.repository.TeamRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }
}
