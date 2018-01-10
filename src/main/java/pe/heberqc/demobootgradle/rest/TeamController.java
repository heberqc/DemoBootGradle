package pe.heberqc.demobootgradle.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.heberqc.demobootgradle.model.Team;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamController {
    @RequestMapping("/teams")
    public List<Team> getTeams(){
        List<Team> list = new ArrayList<>();
        Team team = new Team();
        team.setId(0l);
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        list.add(team);

        team = new Team();
        team.setId(1l);
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        return list;
    }
}