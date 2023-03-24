package sportTeam.service;

import sportTeam.entity.Team;

import java.time.LocalDate;
import java.util.List;

public interface TeamService {
    List<Team> getAllTeams();
    List<Team> getTeamsBySportType(String sportType);
    List<Team> getTeamsForDatePeriod(LocalDate date1, LocalDate date2);
    void changeTeamInfo(Integer id);
    void deleteTeam(Integer id);
}
