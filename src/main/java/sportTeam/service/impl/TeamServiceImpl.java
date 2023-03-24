package sportTeam.service.impl;

import sportTeam.entity.Team;
import sportTeam.service.TeamService;

import java.time.LocalDate;
import java.util.List;

public class TeamServiceImpl implements TeamService {
    @Override
    public List<Team> getAllTeams() {
        return null;
    }

    @Override
    public List<Team> getTeamsBySportType(String sportType) {
        return null;
    }

    @Override
    public List<Team> getTeamsForDatePeriod(LocalDate date1, LocalDate date2) {
        return null;
    }

    @Override
    public void changeTeamInfo(Integer id) {

    }

    @Override
    public void deleteTeam(Integer id) {

    }
}
