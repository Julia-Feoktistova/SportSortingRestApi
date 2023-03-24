package sportTeam.service;

import sportTeam.entity.Participant;

import java.time.LocalDate;
import java.util.List;

public interface ParticipantService {
    List<Participant> getAllByTeam(Integer idTeam);
    List<Participant> getAllByPosition(String position);
    void addParticipant(Integer idTeam, String surname, String lastname, String otchestvo,
                        LocalDate birthDate, String position);
    void changeTeamForParticipant(Integer id, Integer idTeam);
    void changeParticipantInfo(Integer id,  String surname, String lastname, String otchestvo,
                           LocalDate birthDate, String position);
    void deleteParticipant(Integer id);
}
