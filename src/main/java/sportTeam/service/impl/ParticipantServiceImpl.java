package sportTeam.service.impl;

import sportTeam.entity.Participant;
import sportTeam.service.ParticipantService;

import java.time.LocalDate;
import java.util.List;

public class ParticipantServiceImpl implements ParticipantService {
    @Override
    public List<Participant> getAllByTeam(Integer idTeam) {
        return null;
    }

    @Override
    public List<Participant> getAllByPosition(String position) {
        return null;
    }

    @Override
    public void addParticipant(Integer idTeam, String surname, String lastname, String otchestvo, LocalDate birthDate, String position) {

    }

    @Override
    public void changeTeamForParticipant(Integer id, Integer idTeam) {

    }

    @Override
    public void changeParticipantInfo(Integer id, String surname, String lastname, String otchestvo, LocalDate birthDate, String position) {

    }

    @Override
    public void deleteParticipant(Integer id) {

    }
}
